package com.Runner_cucu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/features",
		glue = "com.StepDef_cucu",
		monochrome = true,
		dryRun = false,
		/*plugin = {"rerun:failed_scenarios/failed_failed_scenarios.txt", "preety"}
		 plugin = {"rerun:failed_scenarios/failed_failed_scenarios.txt", "usage"}*/
		plugin = {"rerun:failed_scenarios/failed_failed_scenarios.txt",
        "html:target/cucumber-reports/report.html",
        "json:target/cucumber-reports/report.json",
        "junit:target/cucumber-reports/report.junit",
        }
		)

// Usage is used to perform based on execution time on each method
// Preety is Readble English format user to understand
// HTML, Json and Junit report
public class Test_Runner {

}
