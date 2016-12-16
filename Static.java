class Man{
	String name;
	static String country = "CN";
	Man(String name){
		this.name = name;
	}
	public void show(){
		System.out.println(this.name+":"+country);
	}
}
class Static{
	public static void main(String[] args) {
		Man leo = new Man("leo");
		leo.show();
		Man lei = new Man("lilei");
		lei.show();
		System.out.println(Man.country);
		leo.country = "USA";
		leo.show();
		lei.show();
		System.out.println(Man.country);
	}
}
