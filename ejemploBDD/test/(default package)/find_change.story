Sample story

Narrative:
In order to give small changes
As a change machine
I want to git the small number of coins for an ammount of money
					 
Scenario:  Simple Chnages
Given a change machine
When I ask for change of <value>
Then it retunrs the <coin> coin
					 
Example:
| value | coin |
|  0.01 | 1c   |
|  0.05 | 5c   |

Scenario: Complex Changes

Given a change machine
When I ask for change of 0.03
And I ask for change of 0.02
Then it returns the 1c, 1c, 1c coins
And it returns the 1c, 1c coins