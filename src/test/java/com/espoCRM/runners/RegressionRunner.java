package com.espoCRM.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

	@CucumberOptions(
			plugin = {"http:target/cucumber-report",
					"json:target/cucumber.json"
			},
			features = "src/test/resources/features",
			glue = "com/espoCRM/step_definitions/",
			tags ="@regression",
			dryRun = false
	)
	public class RegressionRunner extends AbstractTestNGCucumberTests {

 
}
