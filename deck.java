import java.util.List;
import java.util.ArrayList;
class Deck{
	private List<Card> deck;
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
		for(int i = 0; i <)
	}
}