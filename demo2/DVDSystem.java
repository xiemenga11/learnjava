import java.util.*;

class DVDSystem{
	public static void main(String[] args) {
		DVDManager dm = new DVDManager();
		
		while(true){
			int i ;
			Scanner sc = new Scanner(System.in);
			sop("====================");
			sop("|    DVD System    |");
			sop("====================");
			sop("1:------menu");
			sop("2:------rent");
			sop("3:------return");
			i = sc.nextInt();
			switch(i){
				case 1:
					dm.showDVDs();
					break;
				case 2:
					sop("please enter DVD id to borrow it!");
					i = sc.nextInt();
					dm.borrow(i);
					break;
				case 3:
					sop("return whitch dvd?");
					i = sc.nextInt();
					dm.Return(i);
				case 0:
					break;
			}
		}
	}
	public static void sop(Object str){
		System.out.println(str);
	}
}