package com.test.java;


class A {
	
	public void method(I i) {
		
		i.method();
		
		
	}
	
}


interface I {
	public void method();
}



class B implements I{
	
	public void method() {
		
		
		System.out.println("BŬ������ �޼��� ");
		
	}
}



public class interfaceTest {

	public static void main(String[] args) {
		
		A a = new A();
		a.method(new B());

	}

}
