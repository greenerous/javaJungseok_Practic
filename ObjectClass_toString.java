package com.test.java;

import java.util.Objects;

class Card { 
	
	String kind;
	int number;
	
	Card() {
		this("SPADE", 1);
	}
	
	Card(String kind, int number) {
		
		this.kind = kind;
		this.number = number; 
	}
	
	//toString Override
	public String toString() {
		return "kind: "+kind+", number: " + number;
		
	}
	
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Card))
			return false;
		
		Card c = (Card)obj;
		return this.kind.equals(c.kind) &&
				this.number ==c.number;
		
	}
	
	public int hashCode() {
		
		return Objects.hash(kind,number);	}
	
}



public class ObjectClass_toString {

	public static void main(String[] args) {
		
		Card c1 = new Card ("Heart",2);
		Card c2 = new Card ();
		Card c3 = new Card ();
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		
		System.out.println(c1.equals(c2));
		System.out.println(c2.equals(c3));
		
	}
	
	
}

//eclipse provides overriding methods :
//	source>
//			>generate hashcode() and equals()
