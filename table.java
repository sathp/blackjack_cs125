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

    /*
     * Creates a new table with the given parameters.
     * Only for starting a game from fresh.
     * @param numOfPlayers - Number of players playing the game.
     * @param money - Amount of money each player starts with.
     */
    public Table(final int numOfPlayers, final double money) {

        // Makes an array of decks
        decks = new Deck[4];
        for (i = 0; i < decks.length; i++) {
            decks[i] = new Deck;
        }

        // Creates a new Dealer object.
        dealer = new Dealer(money);

        // Creates an array of players and gives them money.
        players = new Player[numOfPlayers];
        for (i = 0; i < players.length - 1; i++) {
            players[i] = new Player(money);
        }

        // Keeps of track of the number of players standing. Updates every turn.
        int playersStanding = 0;
    }
}