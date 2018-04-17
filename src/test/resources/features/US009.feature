@us009 @regression
Feature: Contacts 

Background: Logging into espoCRM 
	Given User logged in espoCRM 

Scenario: Verify functionalities of Contacts Page 
	Given User should see existing Contacts
	And Users should see Contacts on the title of the page
	And Contacts Text should be visible on the top of the page
	Then User should see All dropdown, Search Box, Search button, Reset button, ADD FIELD button, Create Contact button 
@us009-2
Scenario: User creates new Contact with valid Credentials
	Given User should be able to Click on Create Contact button
	And User should be able to fill the empty Field boxes 
	Then User should Click to save button 

Scenario: List of Contacts table 
	Given User goes back to Contact Page 
	And User should see Contacts Table List
	And User should able to click one Contact from the list
	Then User should see credential of that contact
	
Scenario: User creates new Contact with NOT valid Credentials
	Given User goes back to Contact Page to create with not valid credentials 
	And User should be able to Click on Create Contact button on page
	And User should be able to fill the empty Field boxes with numbers
	Then User should NOT able to save when he/she clicks to SAVE button at the end 

Scenario: Verify just created Contacts from Contacts Table list
	Given User goes back tp Contact Page 
	And User should not see Contact with NOT valid credentials
	And User should check one contact, click Action dropdown
	Then User should remove contact from table