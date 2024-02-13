package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class DeathStarStepDefinitions {
	DeathStar ds;
	Planet p;
	String result;

	@Given("a Deathstar")
	public void ds() {
		ds = new DeathStar();
	}

	@Given("a Planet with {int} health")
	public void p(Integer health) {
		p = Mockito.mock(Planet.class);
		Mockito.when(p.toString()).thenReturn("Wimpy planet");
		// would check health
	}

	@When("I shoot the planet")
	public void shoot() {
		result = ds.shoot(p);
	}

	@Then("it says: {string} and has {int} health")
	public void check(String s, Integer i) {
		assertEquals(s.replaceAll("\\\\n", "\n"), result);
		Mockito.verify(p).damage(100);
	}


}
