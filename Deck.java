package week6WarGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private List<Card> cards = new ArrayList<Card>();
	private String[] names = {"Spades", "Clubs", "Diamonds", "Hearts"};
	private String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};{
	
	for (String name:names) {
		for (int i = 0; i < values.length; i++) {
			Card card = new Card(values[i], name, i);
			cards.add(card);
		}}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card draw() {
		return cards.remove(0);
			}
	public List<Card> getCards() {
		return cards;
	}
}
