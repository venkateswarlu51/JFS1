package com.javaintroduction2;

public class TestDemo2 {
	void addition(int a,int b) {
		int sum=a+b;
		System.out.println("addition called:"+sum);		
		
	}
	void addition() {
		System.out.println("addition");
	}
	

	public static void main(String[] args) {
		TestDemo2 t=new TestDemo2();
		t.addition(2,5);

	}

}
