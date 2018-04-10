@us03 
Feature: Calendar Event 

Scenario: Add Calendar on dashboard 
	When User clicks on Add Dashlet button 
	And User adds Calendar 
	And User clicks Drop Down menu on a Calendar 
	Then User should verify all options in the menu 
	
Scenario: Create meeting with given Credentials 
	When User clicks on View Calendar 
	And  User clicks any date and create new Meeting with valid credentials in excel sheet "dataUS003.xlsx" and "Sheet1" 
	And  User clicks Full Form and click on Save button 
	Then User should verify given credentials are present in Overview box