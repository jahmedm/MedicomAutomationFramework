package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		
		features="Features",
		glue="com.stepdefinitions",
		dryRun = false,
		monochrome = true,
		plugin = {"json:target/cucumber.json",
				"pretty",
				"html:target/cucumber-html-report"},
		tags="@test02"
		
		
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}
