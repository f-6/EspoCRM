@us004
Feature: Calendar Manipulating

Background: Logging into espoCRM
Given User logged in espoCRM

Scenario: Remove Calendar events
When User clicks on Add Dashlet button
And User adds Calendar
Then User should verify Calendar Box displayed
And If there are scheduled events on the calendar User should click on each event and remove
Then User should verify pop up box is displayed
And User should confirm.
Then User should verify if event has removed

Scenario Outline:
When User clicks on calendar menu option and click on Options
Then User should change "<title>" "<auto-refresh Interval>" "<mode>" and  What to display remove all by clicking.
And User clicks on save Btn
Then User should verify Not Valid error message.
And User checks Calls
Then User should verify Calendar is month option and no Calls is shown( beacause User didnot create one)

Examples:
|title		 |	auto-refresh Interval| 	mode	|
| Fantastic 6| 	10 minutes			 | Month	|





