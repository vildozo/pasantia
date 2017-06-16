Scenario: when a user flips a flipper, its value is increased by 1

Given a flipper
Given the flipper has value 1
When the user flips the flipper
Then the value of the flipper must become 2