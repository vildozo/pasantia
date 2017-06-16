package com.ontestautomation.jbehave.demo;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

public class JBehaveTest extends JUnitStories {

	private Flipper flipper;

	@Given("a flipper")
	public void aFlipper() {

		flipper = new Flipper();
	}

	@Given("the flipper has value 1")
	public void theFlipperHasValueOne() {

		flipper.setValue(1);
	}

	@When("the user flips the flipper")
	public void whenTheUserFlipsTheFlipper() {

		flipper.flipState();
	}

	@Then("the value of the flipper must become 2")
	public void valueOfFlipperMustBecomeTwo() {
		Assert.assertEquals(2, flipper.getValue());
	}

	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(getClass().getClassLoader())).useStoryReporterBuilder(new StoryReporterBuilder().withFormats(Format.CONSOLE));
	}

	@Override
	public List<CandidateSteps> candidateSteps() {
		return new InstanceStepsFactory(configuration(), this).createCandidateSteps();
	}
	
	@Override
	protected List<String> storyPaths() {
		return Arrays.asList("com/ontestautomation/jbehave/demo/test_value.story");
	}

	@Override
	@Test
	public void run() throws Throwable {
		super.run();
	}
}