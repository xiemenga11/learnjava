class Player{
	public String name;
	public int guessNum;

	public Player(String name){
		this.name = name;
	}
	public int guess(){
		this.guessNum = (int)(Math.random()*10);
		return this.guessNum;
	}
}