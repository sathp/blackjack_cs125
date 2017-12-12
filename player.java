import java.util.List;
import java.util.ArrayList;
class Player{
	private int handValue;
	private List<Card> hand;
	private double currentBal;
	private boolean playingGame;

	public double getBal() {
		return currentBal;
	}
	public int getHandVal(){
		return handValue;
	}
	public List<Card> getHand(){
		return hand;
	}
	public Player(double money){
		this.hand = new ArrayList<Card>();
		this.playingGame = true;
		currentBal = money;
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