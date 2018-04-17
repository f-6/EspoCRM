package com.espoCRM.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin = {"html:target/cucumber",
				  "json:target/cucumber.json"
				},
		features="src/test/resources/features/",
		glue="com/espoCRM/step_definitions/",
		tags = {"@us002, @us003, @us007, @us008, @us009, @us010"},
		dryRun = false
)

public class CukesRunner extends AbstractTestNGCucumberTests {

}
