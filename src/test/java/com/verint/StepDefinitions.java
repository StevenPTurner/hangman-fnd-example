package com.verint;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.Set;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	private Hangman hangman;
	private String answer;

	@Given("^I test the cucumber can run$")
	public void testCucumberRuns() {
		assertThat(true, is(true));
	}
}
