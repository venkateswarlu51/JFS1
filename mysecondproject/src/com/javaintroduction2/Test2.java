package com.javaintroduction2;

public class Test2 {
	public static void m1() {
		System.out.println("method 1");
		m5();
		m4();
	}
	public static void m2() {
		System.out.println("method 2");
		
	}
		

	public static void m3() {
		System.out.println("method 3");
	}
	public static void m4() {
		System.out.println("method 4");
		m3();
	}
	public static void m5() {
		System.out.println("method 5");
	}
	void m6(){
		System.out.println("method 6");
		m1();
	}
	void m7(){
		System.out.println("method 7");
		m2();
	}
	void m8(){
		System.out.println("method 8");
	}
	void m9(){
		System.out.println("method 9");
	}
	void m10(){
		System.out.println("method 10");
	}
	

	public static void main(String[] args) {
		Test2 t2 = new Test2();
		t2.m6();
		t2.m7();
		t2.m8();
		t2.m9();
		t2.m10();
		

		
		
		
		
		





	}

}
