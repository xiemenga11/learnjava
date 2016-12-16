class DVD{
	private int id;
	public String name;
	private String type;
	public boolean isBorrowed = false;
	private int year;

	public DVD(int id,String name,String type,int year){
		this.id = id;
		this.name = name;
		this.type = type;
		this.year = year;
	}

	public void borrow(){
		this.isBorrowed = true;
	}
	public void Return(){
		this.isBorrowed = false;
	}
	public void showConfig(){
		System.out.println(this.id+" | "+this.name+" | "+this.type+" | "+this.year+" | "+this.isBorrowed);
	}
}