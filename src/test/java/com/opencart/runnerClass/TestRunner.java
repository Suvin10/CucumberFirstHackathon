package com.opencart.runnerClass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles//contactUs.feature",
				//glue="com.opencart.stepDefinition",
				glue="ContactUsStepDef",
				dryRun = false,
				monochrome = true,
				plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extendreport.html"})
public class TestRunner {

}
