class Card{

	private int value;
	private String name;
	private int suit;
	private boolean inDeck = true;
	public Card(){}
	public Card(String name1, int value1, int value2){
		this.name = new String(name1);
		this.value = value1;
		this.suit = value2;
	}
	public String getName() {
		return this.name;
	}
	public int getVal(){
		return this.value;
	}
	public int getSuit() {
		return this.suit;
	}
	public boolean getStatus() {
		return inDeck;
	}
	public void setStatus(boolean b) {
		inDeck = b;
	}
}
