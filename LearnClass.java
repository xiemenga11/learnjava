public class LearnClass{
	 public static class animal{
		int foot;
		int age;
		String sex;
		String name;
		String food;
		String type;
		public void config(){
			System.out.println(name+" is a "+age+" years old "+type+". And he has "+foot+" legs");
		}
		public void eat(){
			System.out.println(name+" is eating "+food+" right now.");
		}
	}
	public static class dog extends animal{
		public void bark(int times){
			System.out.println(name+" barked "+times+" times.");
		}
	}
	public static void main(String[] args) {
		animal ani = new animal();
		ani.foot = 4;
		ani.age = 3;
		ani.sex = "girl";
		ani.name = "Yami";
		ani.food = "bones";
		ani.type = "dog";
		ani.config();
		ani.eat();

		dog doge = new dog();
		doge.foot = 4;
		doge.age = 2;
		doge.sex = "boy";
		doge.name = "Yami";
		doge.food = "bones";
		doge.type = "dog";
		doge.config();
		doge.eat();
		doge.bark(5);
	}
}