import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import card.java;
class player{
	private int handValue;
	private List<Card> hand;
	private double currentBal;
	public int getHandVal(){
		return handValue;
	}
	public Card[] getHand(){
		return hand;
	}
	public player(){}
	public player(double money){
		this.hand = new ArrayList<Card>();
		currentBal = money;
	}
	public void addCard(Card deal){
		hand.add(deal);
		handValue += deal.getVal();
	}

}