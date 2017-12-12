package src;

import java.util.ArrayList;
import java.util.Collections;
/**
 * 
 * @author satwik
 * Deck class contains an arraylist of card objects.
 * Shuffles the cards randomly and creates a random collection of cards
 */
class Deck{
	private ArrayList<Card> deck;

	private int cardsUsed = 0;

	public ArrayList<Card> getDeck(){
		return deck;
	}

	public Deck(){
		deck = new ArrayList<Card>();
		//create 4 different suits and append them to the list 
		for (int i = 2; i < 15; i++){
			Card temp = new Card(i, "Clubs");
			deck.add(temp);
		}
		for (int i = 2; i < 15; i++){
			Card temp = new Card(i, "Spades");
			deck.add(temp);
		}
		for (int i = 2; i < 15; i++){
			Card temp = new Card(i, "Diamonds");
			deck.add(temp);
		}
		for (int i = 2; i < 15; i++){
			Card temp = new Card(i, "Hearts");
			deck.add(temp);
		}
		//call the randomizer for the list
		shuffle();
	}
	/**
	 * shuffle method for randomizing the card objects in the arraylist 
	 */
	private void shuffle() {
		for(int i = 0; i < 52; i++) {
			int shuffleNumber = (int) Math.random()*(51); //very sophisticated method for generation of random numbers
			Collections.swap(deck, i, shuffleNumber); //very sophisticated method for swapping two objects in our arraylist
		}
	}

	public Card getCard() {
		Card card1 = deck.get(cardsUsed);
		cardsUsed++;
		return card1;
	}
}