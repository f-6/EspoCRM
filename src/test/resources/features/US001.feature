@smoke
Feature: Login and Main page functionalities

Scenario: Login Page all visible funtionalities
	Given User is on application login page
	And User should see EspoCRM title
	And User should see EspoCRM logo 
	And User should see Username, Password boxes
	Then User should see Login button, Forgot Password? text link

Scenario: User is clicking Forgot Password? text link
	Given User should see Submit, Close, Username, Email address, Password Change Request text, x close buttons
	And User should able to enter Username, Email Address
	Then User should click Close button
	
Scenario: Successful Login with Valid Credentials
	Given User is on application login page
	And User enters Username, Password
	Then User should see HomePage of site
	
Scenario: Home page all visible functionalities
	Given User should see Search box, Search button
	And User should see and click Notification button
	And User should see and click Create + sign button
	And User should see and click Menu button
	And User should see and click Edit Dashboard button
	And User should see and click Add Dashlet button
	And User should see EspoCRM homepage logo 
	And User should see Menu List on left side of the window
	Then User should see Dashlet Windows on screen
