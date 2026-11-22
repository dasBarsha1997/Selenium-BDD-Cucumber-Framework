package com.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/resources/features", 
		glue = { "com.stepdefinitions", "com.hooks" },

		monochrome = true,
		dryRun=false,

		plugin = {

				"pretty",

				"html:target/cucumber-report.html" })

public class TestRunner extends AbstractTestNGCucumberTests {

}
