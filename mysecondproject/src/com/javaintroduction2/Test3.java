package com.javaintroduction2;


public class Test3 {

	public static void main(String[] args) {
		Test3 obj = new Test3();
		System.out.println(obj.hello());
	}

	int hello() {
		try {
			return 10;
		} catch (Exception e) {
			return 20;
		} finally {
			return 30;

		}

	}
}
