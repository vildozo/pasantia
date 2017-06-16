package ejemploBDD;

public class FindChangesSteps {
	
	double ammount;
	
	@Given ("a change machine")
		public void createChangeMachine(){
	}
	
	@When("I ask for change of <value>")
	@Alias("I ask for change of $value")
	public void changeFor(@Named("value") double value){
		ammount = value;
	}
	
	@Then("it retunrs the <coin> coin")
	@Alias("it returns the $coin coins")
	public void changeCoins(@Named("coind") String coins){
		assertEquals((int)(ammount*100)+"c", coins);
	}

}
