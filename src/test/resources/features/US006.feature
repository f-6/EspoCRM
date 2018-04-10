Feature: Last Viewed 

Scenario: On home page: User clicks on Menu button: 
	Then user should click Clear Local Cache button 
	And user should click Clear Local Cache button 
	Then user should click Return to Application button 
	And User should see home page 
	
Scenario: On home page: User clicks on Menu button: 
	Then user should click About button 
	And User should see to tables 
	Then User should see www.espoCRM.com link on top tables 
	Then user should click menu button 
	And click log out 
	Then user should see log in page  