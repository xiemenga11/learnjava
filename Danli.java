class Factory{
	int num;
	private static Factory f = new Factory();
	private Factory(){};
	public static Factory getFac(){
		return f;
	}
	public void show(){
		System.out.println("current nail is "+(++num)+" yet");
	}
}
class Danli{
	public static void main(String[] args) {
		Factory fac = Factory.getFac();
		fac.show();
		fac.show();
		fac.show();
		fac.show();
		fac.show();
		fac.show();
		fac.show();
		Factory fac2 = Factory.getFac();
		fac2.show();
		fac2.show();
		fac2.show();
		fac2.show();
		fac2.show();
		fac2.show();
	}
}