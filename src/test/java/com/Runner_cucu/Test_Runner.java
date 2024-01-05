package com.Runner_cucu;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src/test/resources/features",
		glue = "com.StepDef_cucu",
		monochrome = true,
		dryRun = false
		)

public class Test_Runner {

}
