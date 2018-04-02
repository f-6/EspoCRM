Feature: Last Viewed

Scenario: On home page: User clicks on Menu button:
	Then user should see admin, administration preferences, last viewed, clear local cache, about and log out
	And user clicks Last Viewed button
	Given on Last Viewed page user should see list of last viewed pages
	And user clicks on one of the listed results
	Then user should see cridentials 
	And user should click dropdown button right side of edit button
	Then user should click remove button 