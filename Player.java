package week6WarGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name;
	
	public Player(List<Card> hand, int score, String name) {
		this.setHand(hand);
		this.setScore(score);
		this.setName(name);
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void describe() {
		System.out.println(name);
		System.out.println(score);
		for (Card card:hand) {
			card.describe();
		}}
	public Card flip() {
		return hand.remove(0);
	}
	public void draw(Deck cards) {
		hand.add(cards.draw());
	}
	public void incrementScore () {
		score += 1;
	}
}
