package config;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Properties;

import javax.xml.bind.DatatypeConverter;

import org.jbehave.core.Embeddable;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.i18n.LocalizedKeywords;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.model.ExamplesTableFactory;
import org.jbehave.core.model.TableTransformers;
import org.jbehave.core.parsers.RegexPrefixCapturingPatternParser;
import org.jbehave.core.parsers.RegexStoryParser;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.jbehave.core.steps.ParameterConverters;
import org.jbehave.core.steps.ParameterConverters.DateConverter;
import org.jbehave.core.steps.ParameterConverters.ExamplesTableConverter;


import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.HTML_TEMPLATE;
import static org.jbehave.core.reporters.Format.TXT;
import static org.jbehave.core.reporters.Format.XML_TEMPLATE;


public abstract class BaseStories extends JUnitStories {

	private final CrossReference xref = new CrossReference();
	
	public BaseStories(){
		configuredEmbedder().embedderControls().doGenerateViewAfterStories(true).doIgnoreFailureInStories(/*true*/)
			.doIgnoreFailureInView(true).doVerboseFailures(true).useThreads(2).useStoryTimeoutInSecs(/*0*/);
		
			}
	
		@Override
		public Configuration configuration() {
			Class <? extends Embeddable> embeddableClass = this.getClass();
			Properties viewResources = new Properties();
			viewResources.put("decorateNonHtml", "true");
			viewResources.put("reports", "ftl/jbehave-reports-with-totals.ftl");
			// Start from default parameterConverters instance
			ParameterConverters parameterConverters = new ParameterConverters();
			//factory to allow parameter conversion and loading from external resources( use by stroy)
			ExamplesTableFactoryexampleTableFactory = new ExamplesTableFactory(new LocalizedKeywords());
			//add custom converters
			parameterConverters.addConverters(new DatatypeConverter(new SimpleDateFormat(yyyy-MM-dd)),
					new  ExamplesTableConverter(ExamplesTableFactory));
			return new MostUsefulConfiguration()
					.useStoryLoader(new LoadFromClasspath(embeddableClass))
					.useStoryParser(new RegexStoryParser(ExamplesTableFactory))
					.useStoryReporterBuilder(new StoryReporterBuilder()
							)
					
			
			
		}
	
}

