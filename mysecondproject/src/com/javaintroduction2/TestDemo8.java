package com.javaintroduction2;
//no returntype + no arguments

public class TestDemo8 {
	int a=100; 
	void addition() {
		System.out.println("addition:"+a);
	}
	void division() {
		System.out.println("division:"+a);
	}
	

	public static void main(String[] args) {
		TestDemo8 t=new TestDemo8();
		t.addition();
		t.division();
	}

}
