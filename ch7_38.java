package com.test.java;


abstract class Unit{ 
	
	int x,y;
	abstract  void move(int x, int y);
	void stop() {System.out.println("����ϴ�."); 
	}
}


interface Fightable {
 	void move(int x, int y); //public abstract�� ������
 	void attack(Fightable f); //public abstract�� ������
}



class Fighter extends Unit implements Fightable {
	
	public void move(int x, int y) {
		
		System.out.println("AAA");
		
	}; //public abstract�� ������
	public void attack(Fightable f) {
		
		System.out.println(f+"BBB");
		
	}; //public abstract�� ������

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
