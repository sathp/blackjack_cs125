import java.util.List;
import java.util.ArrayList;

class Player{
	private int handValue;
	private List<Card> hand;
	private boolean playingGame;

	public int getHandVal(){
		return handValue;
	}
	public List<Card> getHand(){
		return hand;
	}
	public Player(){
		this.hand = new ArrayList<Card>();
		this.playingGame = true;
	}
	public void addCard(Card deal){
		hand.add(deal);
		handValue += deal.getVal();
	}
	public boolean getPlayingGame() {
		return playingGame;
	}
	public void togglePlayingGame() {
		this.playingGame  = !playingGame;
	}

}

