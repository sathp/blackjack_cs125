class Card{

	private int value;
	private String name;
	public Card(){}
	public Card(String name1, int value1){
		this.name = new String(name1);
		this.value = value1;
	}
	public String getName() {
		return this.name;
	}
	public int getVal(){
		return this.value;
	}
}
