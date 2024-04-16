package edu.pitt.cs;

public class Player {
	private int i = 0;
	Player(Hand hand) {
	}
	Hand throwHand() {
		// Returns Hand.ROCK, Hand.PAPER, Hand.SCISSORS in round robin order
		Hand ret = Hand.values()[i];
		i = ++i % 3;
		return ret;
	}
}
