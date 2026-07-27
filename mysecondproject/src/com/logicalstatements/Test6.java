package com.logicalstatements;

import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first number:");
		int num1 = sc.nextInt();

		if(num1%5==0 && num1%3==0) {
			System.out.println("divisible");
		}else {
			System.out.println("not divisible");
		}
		sc.close();


	}

}
