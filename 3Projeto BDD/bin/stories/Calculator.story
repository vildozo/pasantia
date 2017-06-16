Narrative: As a developer i want to be able to make 
mathematical operations and get a result

Scenario: Add two numbers
	Given i open the calculator
	When I add 2 and 3
	Then the result is 5
	
Scenario: Multiply two numbers
	Given I open the calculator
	When I multiply 2 and 9
	Then the result is 18