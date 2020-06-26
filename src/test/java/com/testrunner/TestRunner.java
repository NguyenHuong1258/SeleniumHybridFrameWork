package com.testrunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(
        plugin = { "pretty","html:target/cucumber/cucumber-html-report",
                "json:target/cucumber/cucumber-json-report.json"},
        monochrome = true,
        features = {"classpath:featurefiles/"},
        glue = {"com.stepdefinitions"}
)
@RunWith(Cucumber.class)
public class TestRunner {
}
