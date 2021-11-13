package com.test.java;


abstract class Unit{ 
	
	int x,y;
	abstract  void move(int x, int y);
	void stop() {System.out.println("¸ÙÃä´Ï´Ù."); 
	}
}


interface Fightable {
 	void move(int x, int y); //public abstract°¡ »ý·«µÊ
 	void attack(Fightable f); //public abstract°¡ »ý·«µÊ
}



class Fighter extends Unit implements Fightable {
	
	public void move(int x, int y) {
		
		System.out.println("AAA");
		
	}; //public abstract°¡ »ý·«µÊ
	public void attack(Fightable f) {
		
		System.out.println(f+"BBB");
		
	}; //public abstract°¡ »ý·«µÊ

	Fightable getFightable() {
		
		Fighter f = new Fighter();
		
		return f;
	}
	
	
}


public class ch7_38 {

	public static void main(String[] args) {
		
		Fighter f = new Fighter();

		Unit u = new Fighter();
		Fightable t = new Fighter();
		
		f.move(100,200);
		f.attack(new Fighter());
		
		u.move(0, 0);
		u.stop();
		//u.attack(f)
		
		t.attack(f);
		//t.stop();
		
		Fighter f2 = new Fighter();
		Fightable f3 = f.getFightable(); 
		
		
		
	}
	
	
}
