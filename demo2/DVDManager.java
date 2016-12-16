class DVDManager{
	public DVD[] dvds = {
		new DVD(1,"007","action",2011),
		new DVD(2,"hahaha","comdy",1998),
		new DVD(3,"Tiger","action",1986)
	};
	public void showDVDs(){
		for(int i = 0; i < dvds.length; i++){
			dvds[i].showConfig();
		}
	}
	public void borrow(int id){
		if(dvds[id-1].isBorrowed){
			System.out.println(dvds[id-1].name+" is borrowed!");
		}else{
			dvds[id-1].borrow();
		}
	}
	public void Return(int id){
		dvds[id-1].Return();
	}

}