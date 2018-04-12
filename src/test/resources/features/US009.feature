Feature: Contacts 
Background: Contacts 
Scenario: Verify functionalities of Contacts Page 
	Given User should see existing Contacts 
	And Users should see Contacts on the title of the page 
	And Contacts Text shoul be visible on the top of the page 
	And User should see Search Box, Search button, Reset button, ADD FIELD button and Create Contact button 
	
Scenario: List of Contacts table 
	Given User should see Contacts Table List 
	And User should able to click one Contact from the list
	Then User should see credential of that contact 
	
Scenario: User creates new Contact with valid Credentials
	Given User goes back tp Contact Page 
	And User should be able to Click on Create Contact button 
	And User should be able to fill the empty Field boxes 
	Then User should Click to save button 
	
Scenario: User creates new Contact with NOT valid Credentials
	Given User goes back tp Contact Page to create with not valid credentials 
	And User should be able to Click on Create Contact button on page
	And User should be able to fill the empty Field boxes with numbers
	Then User should NOT able to save when he/she clicks to SAVE button at the end 
	
Scenario: Verify just created Contacts from Contacts Table list
	Given User goes back tp Contact Page 
	And User should see new Created Contacts on the Contacts Table list
	And User should see Contact with valid credentials
	And User should not see Contact with NOT valid credentials
	And User should check one contact, click Action dropdown
	Then User should remove contact from table