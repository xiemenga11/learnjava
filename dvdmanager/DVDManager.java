import java.util.Scanner;
class DVDManager{
	public static void main(String[] args) {

		DVD[] dvds = new DVD[10];
		dvds[0] = new DVD(1,"xiao-ao-jiang-hu","Action","2005","XieMeng");
		dvds[1] = new DVD(2,"xi-ju-zhi-wang","Comdy","2007","ZhouXingChi");
		dvds[2] = new DVD(3,"qi-yue-ban","Thriller","1997","ZhouXingChi");
		dvds[3] = new DVD(4,"gong-fu-xiong-mao","Comdy","2013","American");
		dvds[4] = new DVD(5,"a-fan-da","Action","2014","LiAn");

		Scanner sc = new Scanner(System.in);
		
		while(true){
			pr("------------- Controll List --------------");
			showMenu();
			pr("||-----      ---------------------------||");
			pr("Show me what do you want to do ?");
			int act = sc.nextInt();
			doActioin(act,sc,dvds);

		}
	}
	public static void showDVDList(DVD[] dvds){
		for (int i = 0; i < 5 ; i++ ) {
			dvds[i].config();
		}
	}
	public static void showMenu(){
		pr("1--borrow dvd");
		pr("2--return dvd");
		pr("3--dvd config");
		pr("4--show dvd list");
	}
	public static void doActioin(int act,Scanner sc,DVD[] dvds){
		if(act == 1){
			pr("which DVD do you want to borrow?");
			int id = sc.nextInt();
			dvds[id-1].borrow();
		}else if (act == 2) {
			pr("which DVD do you want to return?");
			int id = sc.nextInt();
			dvds[id-1].Return();
		}else if (act == 3){
			pr("which DVD do you want know?");
			int id = sc.nextInt();
			dvds[id-1].info();
		}else if (act == 4){
			pr("************* DVD LIST *************");
			showDVDList(dvds);
			pr("************************************");
		}else{
			pr("bye bye");
		}
	}
	public static void pr(Object msg){
		System.out.println(msg);
	}
}