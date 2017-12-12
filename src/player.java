package src;

import java.util.ArrayList;
/*
 * Class that emulates a player.
 * Each player has:
 * - an ID (id)
 * - a 'hand' of cards (hand);
 * - value of hand (handValue);
 * - whether the player is playing that specific game (playingGame)
 * Each player can:
 * - check value of hand (checkHandValue();)
 * - stand (or hold the current number of cards) (stand();)
 * - hit (or be dealt a new card) (hit();)
 */
class Player{

	/* A class variable that holds teh unique identifier of each player. */
	private int ID;

	/* A class variable (List of Card objects) that holds a list of cards dealt to the player / hand. */
	private ArrayList<Card> hand;

	/* A class variable (integer) that holds the value of the player's hand (or cards). */
	private int handValue;

	/* A class variable (boolean) that keeps track of whether a player is still in the game. */
	private boolean playingGame;
	public int getID() {
		return ID;
	}

	public int getHandVal(){
		return handValue;
	}
	public ArrayList<Card> getHand(){
		return hand;
	}
	public Player(int a){
		this.hand = new ArrayList<Card>();
		this.playingGame = true;
		ID = a;
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

