package com.test.java;

public class abstractClass {

	public static void main(String[] args) {
		
		Unit[] group = {new Marine(),new Tank(), new Dropship()};
		
		
		group[0].move(100,200);
		group[1].move(100,200);
		group[2].move(100,200);
		
	}
	
	
	abstract class Unit {
		
		int x,y;
		abstract void move (int x, int y);
		void stop() {}	
	}
	
	
	class Marine extends Unit{
		void move(int x, int y){
		
			
		}
		
	}
	
	
	
	
}




