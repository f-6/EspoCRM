@regression
@us007
Feature: Account page functionalities 
Background: Logging into espoCRM
Given User logged in espoCRM

Scenario: Account Page all visible funtionalities 
	Given User is on application Account page 
	And User should see EspoCRM title in Account page
	And User should see EspoCRM logo in Account page 
	And User should see Search box in Account page
	Then User should see All, Reset,Add Field buttons
	Then User should see Create Account button 
	Then User should see List Of Accounts 
	
Scenario: User is clicking Create Account button 
	Given User should see Positive Username, Email address, Phone, Web-site, Billing address(which includes: street name, city, state, postal code and country), Shipping address(which includes: street name, city, state, postal code and country),Details: Type, Sic code, Industry and Descriptions boxes 
	And User should able to enter his positive credantials to all requred boxes 
	Then User should click Save button 
	And User enters key words about his account to Search box 
	And click on Search button 
	Then User should see his Account on Result list 
	
	
