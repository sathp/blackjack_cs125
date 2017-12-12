import java.util.List;
import java.util.ArrayList;
<<<<<<< HEAD
class Player{
=======
class player{
>>>>>>> ade34703d4fb6cee2642310a98d1fe80aa0e9d0c
	private int handValue;
	private List<Card> hand;
	private double currentBal;
	public double getBal() {
		return currentBal;
	}
	public int getHandVal(){
		return handValue;
	}
	public List<Card> getHand(){
		return hand;
	}
<<<<<<< HEAD
	public Player(double money){
=======
	public player(double money){
>>>>>>> ade34703d4fb6cee2642310a98d1fe80aa0e9d0c
		this.hand = new ArrayList<Card>();
		currentBal = money;
	}
	public void addCard(Card deal){
		hand.add(deal);
		handValue += deal.getVal();
	}

}