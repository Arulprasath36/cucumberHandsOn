package com.cucumber.runnerClass;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "features/sample.feature",
        glue = "com.cucumber.stepDefinitions"
         )
public class RunCukeTest {
}
