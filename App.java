package week6WarGame;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		List<Card> handP1 = new ArrayList<>();
		List<Card> handP2 = new ArrayList<>();
		Player p1 = new Player(handP1, 0, "Player 1");
		Player p2 = new Player(handP2, 0, "Player 2");
		deck.shuffle();
		for(int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				p1.draw(deck);
			}else {
				p2.draw(deck);
			}
		}
		for(int i = 0; i < 26; i++) {
			Card p1Card = p1.flip();
			Card p2Card = p2.flip();
			System.out.println("Player 1 card: ");
			p1Card.describe();
			System.out.println("Player 2 card: ");
			p2Card.describe();
			
			if (p1Card.getRank() > p2Card.getRank() ) {
				p1.incrementScore();
				System.out.println("Player 1 gets point");
			}else if (p1Card.getRank() < p2Card.getRank()) {
				p2.incrementScore();
				System.out.println("Player 2 gets point");
							}
			else {
				System.out.println("Draw. No points awarded.");
			}
			System.out.println("Player 1 score: " + p1.getScore() + "\t" + "Player 2 score: " + p2.getScore() + "\n");
		}
		System.out.println("Final scores: ");
		System.out.println("Player 1: " + p1.getScore());
		System.out.println("Player 2: " + p2.getScore());
		if (p1.getScore() > p2.getScore()) {
			System.out.println("Player 1 wins!");
		}
		else if (p2.getScore() > p1.getScore()) {
			System.out.println("Player 2 wins!");
		}
		else {
			System.out.println("Draw. Better luck next time, losers!");
		}
	//p1.describe();
	//p2.describe();
	}

}
