package abba.jbehave;

import java.util.Arrays;
import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;

public class configuracionGato {

	public static void main(String[] args) {
		
	}
		public Configuration configuration() {
		    return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(getClass().getClassLoader())).useStoryReporterBuilder(new StoryReporterBuilder().withFormats(Format.CONSOLE));
		}
		 
		public List<CandidateSteps> candidateSteps() {
		    return new InstanceStepsFactory(configuration(), this).createCandidateSteps();
		}
		     
		protected List<String> storyPaths() {
		    return Arrays.asList("com/ontestautomation/jbehave/demo/test_value.story");
		}
		 
		@Test
		public void run() throws Throwable {
		    super.run();

	}

}
