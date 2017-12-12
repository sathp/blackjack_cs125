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
	public ArrayList<Card> getDeck(){
		return deck;
	}
	public Deck(){
		deck = new ArrayList<Card>();
		//create 4 different suits and append them to the list 
		for (int i = 2; i < 15; i++){
			Card temp = new Card(2, "Clubs");
			deck.add(temp);
		}
		for (int i = 2; i < 15; i++){
			Card temp = new Card(2, "Spades");
			deck.add(temp);
		}
		for (int i = 2; i < 15; i++){
			Card temp = new Card(2, "Diamonds");
			deck.add(temp);
		}
		for (int i = 2; i < 15; i++){
			Card temp = new Card(2, "Hearts");
			deck.add(temp);
		}
		//call the randomizer for the list
		shuffle();
	}
	/**
	 * shuffle method for randomizing the card objects in the arraylist 
	 */
	private void shuffle() {
		for(int i = 0; i < 53; i++) {
			int shuffleNumber = (int) Math.random()*(52); //very sophisticated method for generation of random numbers
			Collections.swap(deck, i, shuffleNumber); //very sophisticated method for swapping two objects in our arraylist
		}
	}
}