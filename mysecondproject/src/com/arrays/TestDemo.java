package com.arrays;

public class TestDemo {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int search = 30;
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search) {
				flag = true;
				break;

			}
		}
		if (flag) {
			System.out.println(search+ "is extend");

		} else {
			System.out.println(search+ " not extended");
		}
	}

}
