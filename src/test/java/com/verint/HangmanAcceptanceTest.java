package com.verint;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", strict = true)
public class HangmanAcceptanceTest {
    // This is a runner for Cucumber acceptance tests
}
