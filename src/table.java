package src;
import java.util.Scanner;
/*
 * A class that emulates a Blackjack Table.
 * Contains:
 * - Multiple Decks of Shuffled Cards (decks, newDeck())
 * - Players (players)
 * - A Dealer that also plays the game (dealer)
 * The class contains methods than can:
 * - Deal Cards (deal();)
 * - Check if the game has been won (checkHand();)
 * - Determine the winner (getWinner();)
 */
class Table{

    /* Class variable that holds multiple number of decks of cards. */
    private Deck[] decks;

    /* Class variable that holds player objects. */
    private Player[] players;

    /*
     * Class variable that holds the number of players standing.
     * When all the players are standing, the dealer's cards are displayed.
     */
    private int playersStanding;
    public int getPlayersStanding() {
    	return playersStanding;
    }
    /* Class that holds the dealer. */
    private Dealer dealer;

    /* Class variable that holds target. */
    public static final int TARGET = 21;
    /*
     * Creates a new table with the given parameters.
     * Only for starting a game from fresh.
     * @param numOfPlayers - Number of players playing the game.
     */
    public Table(final int numOfPlayers) {

        // Makes an array of decks
        this.newDeck();

        // Creates a new Dealer object.
        this.dealer = new Dealer();

        // Creates an array of players and gives them money.
        players = new Player[numOfPlayers];
        for (int i = 0; i < players.length ; i++) {
            players[i] = new Player(i);
        }
    }
    		public void playGame() {
	        // Deals players cards round wise. Repeats for loops to remain authentic.
	        // Card 1
	        deal(dealer);
	        for (int i = 0; i < players.length - 1; i++) {
	            deal(players[i]);   
	        }
	        // Card 2
	        deal(dealer);
	        for (int i = 0; i < players.length - 1; i++) {
	            deal(players[i]);
	        }
	        // Check to see if game has been won.
	        while(playersStanding != players.length) {
	        	for (int i = 0; i < players.length - 1; i++) {
	                deal(players[i]);
	            }
	        }
	        while(dealer.getHandVal() <= 16) {
	        	deal(dealer);
	        }
	        getWinner();
	    }

    /* Used to create a new deck of card while initialising a table. */
    public void newDeck() {
        this.decks = new Deck[4];
        for (int i = 0; i < decks.length; i++) {
            this.decks[i] = new Deck();
        }
    }

    /* Deals a player object a card from the top of a random deck. */
    public void deal(final Player player) {
    		Scanner sc = new Scanner(System.in);
        if (checkHand(player) == true&& player.getPlayingGame()) {
            int deckNumber = (int) Math.random()*3;
            Card card = decks[deckNumber].getCard();
            System.out.println("1. Hit 2. Stand");
            int i = sc.nextInt();
            if(i == 1) {
            		player.addCard(card);
            		System.out.println("You were dealt: " + card.getName());
            } else if (i == 2) {
            		player.togglePlayingGame();
            		playersStanding++;
            } else {
            		System.out.println("Wrong Choice try again!");
            		deal(player);
            }
        }
        sc.close();
    }

    /* Checks if dealer won, else, checks if players have met target and sets hands and bets accordingly.*/
    public boolean checkHand(final Player player) {
        if (player.getPlayingGame() == true) {
            if (player.getHandVal() > TARGET && player.getPlayingGame()) {
                player.togglePlayingGame();
                playersStanding++;
                return false;
            }
            if (player.getHandVal()< TARGET) {
                return true;
            }
        }
        return false;
    }

    /* Method that allows player to stand. */
    public void stand(Player a) {
    	a.togglePlayingGame();
    	playersStanding++;
    }

    /*
     * Method used to determine winner of game.
     * @return Player object that wins the game.
     */
    public void getWinner() {
        // Checks if dealer has won.
        if (dealer.getHandVal() == TARGET) {
            System.out.println("Dealers wins by default!");
        }
        else {
	        // Creates an array of handValues
	        int[] handValues = new int[players.length - 1];
	        for (int i = 0; i < players.length - 1; i++) {
	            handValues[i] = players[i].getHandVal();
	        }
	        // Checks array of handValues for unique winner. If multiple players reach target, dealer wins.
	        for(int i = 0; i < handValues.length; i++) {
		        	if(dealer.getHandVal()<=21) {
		        		if(handValues[i] >= dealer.getHandVal() && handValues[i] <= 21) {
		        			System.out.println("" + players[i] + " won against the dealer!");
		        		} else {
		        			System.out.println("" + players[i] + " lost against the dealer!");
		        		}
		        	} else {
		        		if(handValues[i] <= 21) {
		        			System.out.println("" + players[i] + " won against the dealer!");
		        		} else {
		        			System.out.println("" + players[i] + " lost against the dealer!");
		        		}
		        	}
	        	}
	        }
        }

    public static void main(String[] args) {
    		boolean wannaPlay = true;
    		while(wannaPlay) {
    			System.out.println("BlackJack");
        		Scanner sc = new Scanner(System.in);
        		System.out.println("How many players? ");
	    		int i = sc.nextInt();
	    		Table gamePlay = new Table(i);
	    		gamePlay.playGame();
	    		System.out.println("Play again? 1.Yes 2. No ");
	    		i = sc.nextInt();
	    		if(i == 2) {
	    			wannaPlay = false;
	    		}
	    		sc.close();
    		}
    		
    }
}