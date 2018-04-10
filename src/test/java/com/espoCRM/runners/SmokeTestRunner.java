package com.espoCRM.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		features="src/test/resources/features/",
		glue="com/espoCRM/step_definitions",
		tags = "@smoke",
		dryRun = false
		)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {
}
