package edu.pitt.cs;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

public class StepDefinitions {
	private RockPaperScissors rps;
	private Player p1;
	private Player p2;
	private ScoreBoard sb;

	@Given("an RPS game")
	public void anRPS() {
		p1 = new Player(Hand.ROCK);
		p2 = new Player(Hand.ROCK);
		sb = new ScoreBoard();
		rps = new RockPaperScissors(p1, p2, sb);
	}

	@When("the game is played {int} rounds")
	public void incValTimes(Integer times) {
		rps.play((int)times);
	}

	@Then("the scoreboard is {string}")
	public void getValCheck(String outcome) {
		assertEquals(outcome.replaceAll("\\\\n", "\n"), sb.toString());
	}
}
