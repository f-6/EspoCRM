Feature: Contacts
Background: Contacts
Given User should see existing and Created a new Contacts
Scenario: User enters to Contacts page 
Then Users should see Contacts on the title and Contacts sing on the top of the page. 
And User should see Search Box, Search button, Reset Button, ADD FIELD button and Create Contact button.
Then User should see Contact List
And User should  click on Contact
Then User should see credential of that contact

Scenario: User creates new Contact
Then User goes back tp Contact Page
Then User should be able to Click on Create Contact Button 
Then User should be able to FILL OUT REPOSITORY boxes
And User should Click to save button
Then User goes back tp Contact Page
And User should see newly Created Contact on the list