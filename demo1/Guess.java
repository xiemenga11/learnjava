class Guess{
	public static void main(String[] args) {
		while(true){
			int nums = (int)(Math.random()*10);
			

			Player p1 = new Player("leo");
			Player p2 = new Player("zheng");
			Player p3 = new Player("xie");

			int p1n = p1.guess();
			int p2n = p2.guess();
			int p3n = p3.guess();

			boolean p1r = false;
			boolean p2r = false;
			boolean p3r = false;
			
			display("the number is "+nums);
			display("*************************");

			if(p1n == nums){
				p1r = true;
				display(p1.name+" is right; He guessed "+p1n);
				display("----------------------");
			}else{
				display(p1.name+" guessed "+p1n+" is wrong! ");
			}
			if(p2n == nums){
				p2r = true;
				display(p2.name+" is right; He guessed "+p2n);
				display("----------------------");
			}else{
				display(p2.name+" guessed "+p2n+" is wrong! ");
			}
			if(p3n == nums){
				p3r = true;
				display(p3.name+" is right; He guessed "+p3n);
				display("----------------------");
			}else{
				display(p3.name+" guessed "+p3n+" is wrong! ");
			}

			display("////////////////////////////////////////");

			if(p1r && p2r && p3r){
				break;
			}
		}

	}

	public static void display(Object msg){
		System.out.println(msg);
	}
}