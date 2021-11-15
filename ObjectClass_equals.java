package com.test.java;


class Person{
	
	long id;
	
	public boolean equals(Object obj) {
		
		if (obj instanceof Person)
			return id == ((Person)obj).id;
		
		else
			return false;
		
		
	}
	
	
	Person(long id) {this.id = id;}
	
	
}



public class ObjectClass_equals {

	public static void main(String[] args) {
		Person p1 = new Person(930213);
		Person p2 = new Person(690427);
		
		if (p1.equals(p2))
			System.out.println("같은 사람");
		else 
			System.out.println("다른 사람");
		
		
		
	}
	
	
}
