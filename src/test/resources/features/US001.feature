@us001 @regression
Feature: Login and Main page functionalities
Background: Logging into espoCRM
	Given User is on application login page
	
Scenario: Login Page all visible funtionalities
	And User should see EspoCRM title
	And User should see EspoCRM logo 
	And User should see Username, Password boxes
	Then User should see Login button, Forgot Password? text link

Scenario: User is clicking Forgot Password? text link
	Then User should see Login button, Forgot Password? text link
	Given User should see Submit, Close, Username, Email address, Password Change Request text, x close buttons
	And User should able to enter Username, Email Address
	Then User should click Close button
	
Scenario: Successful Login with Valid Credentials
	And User enters Username, Password
	Then User should see HomePage of site
	Given User should see Search box, Search button
	And User should see and click Notification button
	And User should see and click Create + sign button
	And User should see and click Menu button
	And User should see and click Edit Dashboard button
	And User should see and click Add Dashlet button
	And User should see EspoCRM homepage logo 
	And User should see Menu List on left side of the window
	Then User should see Dashlet Windows on screen
