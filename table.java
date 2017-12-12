import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import player.java;

class Table{

    /* Class variable that holds multiple number of decks of cards. */
    private Deck[] decks;

    /* Class variable that holds player objects. */
    private Player[] players;

    /*
     * Class variable that holds the number of players standing.
     * When all the players are standing, the dealer's cards are displayed.
     */
    private int playersStanding; // How many players are 'stand'ing. When all the players are standing, the dealer's cards are displayed.

    /* Class variable that holds the minimum bet amount required to play a game. */
    private double minBet
    /*
     * Creates a new table with the given parameters.
     * Only for starting a game from fresh.
     * @param numOfPlayers - Number of players playing the game.
     * @param money - Amount of money each player starts with.
     */
    public Table(final int numOfPlayers, final double money, final double minBet) {

        // Makes an array of decks
        this.newDeck();

        // Creates a new Dealer object.
        this.dealer = new Dealer(money);

        // Sets the minimum bet to play a game at the table.
        this.minBet = minBet;

        // Creates an array of players and gives them money.
        players = new Player[numOfPlayers];
        for (i = 0; i < players.length - 1; i++) {
            players[i] = new Player(money);
        }

        // Keeps of track of the number of players standing. Updates every turn.
        int playersStanding = 0;
    }

    /*
     * Used to start a new game once a game has been won and available balance is greater
     * than the minimum amount needed for each game.
     */
    public void newGame() {
        this.newDeck();
        for (i = 0; i < players.length - 1; i++) {
            players[i].hand = ArrayList<Card>();
        }
    }

    public void newDeck() {
        this.decks = new Deck[4];
        for (i = 0; i < decks.length; i++) {
            this.decks[i] = new Deck;
        }
    }

    public void deal() {
        
    }
}