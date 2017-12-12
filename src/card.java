package src;

class Card{
	private int value;
	private String name = new String();
	private String suit;
	private boolean inDeck = true;
	public boolean isOut() {
		return inDeck;
	}
	public void change() {
		inDeck = false;
	}
	public String getName() {
		return name;
	}
	public void setName(int value1) {
		if (value1 == 12) {
			name = "Queen of " + suit;
		}
		if (value1 == 11) {
			name = "Jack of " + suit;
		}
		if (value1 == 13) {
			name = "King of " + suit;
		}
		if (value1 == 14) {
			name = "Ace of " + suit;
		}
	}
    Card(int value1, String suit1){
    	suit = new String(suit1);
    	if (value1>10) {
    		if (value1 == 14) {
    			value = 11;
    		}
    		else {
    			value = 10;
    		}
    			
    	} else {
    		this.value = value1;
    	}
    	this.setName(value1);
    }
    public int getVal(){
        return value;
    }
}
