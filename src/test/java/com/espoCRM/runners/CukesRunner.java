package com.espoCRM.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
//		plugin = {"html:target/cucumber"},
		features="src/test/resources/features/",
		glue="com/espoCRM/step_definitions/",
		tags = "@us03",
		dryRun = false
)
public class CukesRunner extends AbstractTestNGCucumberTests {

}
