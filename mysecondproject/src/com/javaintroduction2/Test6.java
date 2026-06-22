package com.javaintroduction2;

public class Test6 {
	public static void m1() {
		System.out.println("hello wellocome java");
		m2();
		m3();
	}
	public static void m2() {
		System.out.println("nice day");
		
	}
		

	public static void m3() {
		System.out.println("end day");
	}
	void m4(){
		System.out.println("instance method");
		m1();
		m5();
		m6();
	}
	void m5(){
		System.out.println("hello");
	}
	void m6(){
		System.out.println("hii");
	}

	public static void main(String[] args) {
		Test6 t1 = new Test6();
		t1.m4();
		
	}

}
