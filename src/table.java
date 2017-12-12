import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import player.java;
import deck.java;

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


    /* Class that holds the dealer. */
    private Dealer dealer;

    /* Class variable that holds target. */
    public static final int TARGET = 21;

    private boolean gameOver = false;
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
        for (int i = 0; i < players.length - 1; i++) {
            players[i] = new Player();
        }

        // Keeps of track of the number of players standing. Updates every turn.
        int playersStanding = 0;

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
        if(getWinner() != null) {
            gameOver(getWinner());
        }

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
        if (checkHand(player) == true) {
            deckNumber = (int) Math.random()*3;
            card = decks[deckNumber].getCard();
            player.addCard(card);
        }
    }

    /* Checks if dealer won, else, checks if players have met target and sets hands and bets accordingly.*/
    public boolean checkHand(final Player player) {
        if (player.getPlayingGame() == true) {
            if (player.getHandVal() > TARGET) {
                player.togglePlayingGame();
                return false;
            }
            if (player.getHand < TARGET) {
                return true
            }
        }
        return false;
    }

    /* Method that allows player to stand. */
    public void stand() {

    }

    /*
     * Method used to determine winner of game.
     * @return Player object that wins the game.
     */
    public Player getWinner() {
        // Checks if dealer has won.
        if (dealer.getHandVal() == TARGET) {
            return dealer;
        }

        // Creates an array of handValues
        int[] handValues = int[players.length - 1]
        for (int i = 0; i < players.length - 1; i++) {
            handValues[i] = players[i].getHand;
        }

        // Checks array of handValues for unique winner. If multiple players reach target, dealer wins.
        for (int i = 0; i < handValues.length - 1; i++) {
            for (int x = i + 1; x < handValues.length - 1; x++) {
                if (handValues[i] == TARGET) {
                    if (handValues[i] == handValues[x]) {
                        return dealer;
                    } else {
                        return players[i];
                    }
                } else {
                    return null;
                }
            }
        }
    }

    /*
     * Method to end the game.
     * @return boolean - Indicates whether game has successfully been ended or not.
     */
    public boolean gameOver(final Player player) {
        gameOver = true;
        System.out.println(player.getID() + "is the winner!");
    }

}