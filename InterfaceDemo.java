interface Inter1{
	int AGE = 35;
	void show();
}
interface Inter2{
	int NUM = 23;
	void show();
}
class demo implements Inter1,Inter2{
	public void show(){
		System.out.println(AGE+":"+NUM);
	}
}
class InterfaceDemo{
	public static void main(String[] args) {
		demo d = new demo();
		d.show();
	}
}