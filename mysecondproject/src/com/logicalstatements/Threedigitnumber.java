package com.logicalstatements;

import java.util.Scanner;

public class Threedigitnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int num = sc.nextInt();

		if(num >= 100 && num <= 999) {
			System.out.println("Three digit number");
		}else {
			System.out.println("Not a three digit number");
		}

		sc.close();
		

	}

}
