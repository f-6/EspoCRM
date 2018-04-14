@us002
Feature: Dashlet window functionalities

Background: Logging into espoCRM
Given User logged in espoCRM

Scenario: Add and Add all Dashlet windows
	Given User should able to add new Dashlet window
	Then User should see that all Dashlet are added

Scenario: Move and Remove all Dashlet windows
	Then User should able to move Dashlet window
	Given User should able to Remove all dashlets
	And User should able to see all dashlets are removed