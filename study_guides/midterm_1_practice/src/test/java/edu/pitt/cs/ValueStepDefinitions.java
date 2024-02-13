package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class ValueStepDefinitions {
	private Value v;

	@Given("a Value")
	public void aValue() {
		v = new Value();
	}

	@When("I call incVal {int} times")
	public void incValTimes(Integer times) {
		int i = 0;
		while (i<times) {
			v.incVal();
			i++;
		}
	}

	@Then("getVal returns {int}")
	public void getValCheck(Integer times) {
		assertEquals((int)times, v.getVal());
	}
}
