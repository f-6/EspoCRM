@us010 @regression
Feature: Contacts 
Background: Logging into espoCRM 
	Given User logged in espoCRM 
	Given User should able go to Email button 
Scenario: Cheking emails 
	When User should able click to Compose button 
	Then User should able to Fill all the fields and Save 
	And User should able to Save as a Draft 
Scenario: Cheking Draft box //  
	Then User should able click to Draft button on Emails page  
	And User should able to check recently added mail in Draft menu // 
	Then User should check is last Draft is in Draft box // 
	And User should able to open recently added mail // 
	Then User should able try to send again // 
	And  User should able to check Draft box again 
	Then User should able to check Last send mail in Send Box