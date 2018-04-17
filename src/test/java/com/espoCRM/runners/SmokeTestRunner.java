package com.espoCRM.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"html:target/cucumber-report",
				"json:target/cucumber.json"
		},
		features="src/test/resources/features/",
		glue="com/espoCRM/step_definitions",//com/espoCRM/step_definitions/US001_stepDefs.java
		tags = "@us001",
		dryRun = false
		)

public class SmokeTestRunner extends AbstractTestNGCucumberTests {
}
