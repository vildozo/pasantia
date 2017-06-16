package abba.jbehave;

import java.util.List;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.junit.JUnitStories;

import org.junit.Assert;

public class JBehaveTest extends JUnitStories {
	 
    private Flipper flipper;
 
    @Given("a flipper")
    public void aFlipper() {
 
        flipper = new Flipper();
    }
    
    
    @Given("the flipper has a value 1")
    public void flipersValueIs1(){
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
	protected List<String> storyPaths() {
		// TODO Auto-generated method stub
		return null;
	}
}