package Runner;


import java.util.Arrays;
import java.util.List;
 
import org.jbehave.core.junit.JUnitStories;

import Steps.ExampleSteps;
 
public class SimpleJBehave extends JUnitStories {
 
	public SimpleJBehave() {
		super();
		this.configuredEmbedder().candidateSteps().add(new ExampleSteps());
	}
 
	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("de/codecentric/simplejbehave/Math.story");
	}
}
