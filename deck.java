import java.util.ArrayList;
import java.util.Collections;
class Deck{
	private ArrayList<Card> deck;
	private int cardsUsed = 0;
	public Deck(){
		deck = new ArrayList<Card>();
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
	}
	public void shuffle() {
		for(int i = 0; i < 53; i++) {
			int shuffleNumber = (int) Math.random()*(52);
			Collections.swap(deck, i, shuffleNumber);
		}
	}

	public Card getCard() {
		card = deck.get(cardsUsed);
		cardsUsed++;
		return card;
	}
}