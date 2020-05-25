Feature: Check calculation
Scenario: Validate addition
	Given user has two values to add
		When user add two values
		Then answer should be returned by adding two values