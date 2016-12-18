class DVD{
	protected String name;
	protected String director;
	protected String year;
	protected String type;
	protected boolean isBorrowed = false;
	protected int id;

	public DVD(int id,String name,String type,String year,String director){
		this.id = id;
		this.name = name;
		this.type = type;
		this.year = year;
		this.director = director;
	}
	public void config(){
		System.out.println(this.id+" | "+this.name+" | "+this.type+" | "+this.year+" | "+this.director+" | "+this.isBorrowed);
	}
	public void info(){
		System.out.println("--------DVD Info------------");
		System.out.println("        id : "+this.id);
		System.out.println("      name : "+this.name);
		System.out.println("      type : "+this.type);
		System.out.println("      year : "+this.year);
		System.out.println("  director : "+this.director);
		System.out.println("isBorrowed : "+this.isBorrowed);
		System.out.println("----------------------------");
	}
	public void borrow(){
		if(this.isBorrowed == false){
			this.isBorrowed = true;
		}else{
			System.out.println(this.name+" is borrowed ! What about orthers ?");
		}
	}
	public void Return(){
		if(this.isBorrowed == true){
			this.isBorrowed = false;
		}else{
			System.out.println(this.name+" haven't be borrowed yet !!");
		}
	}
}