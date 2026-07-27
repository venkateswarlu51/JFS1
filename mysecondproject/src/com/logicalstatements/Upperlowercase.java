package com.logicalstatements;

import java.util.Scanner;

public class Upperlowercase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter letter:");
		char ch = sc.next().charAt(0);

		if(ch>='A'&&ch<='Z'){
			System.out.println("upper");
		}else if( ch>='a'&&ch<='z') {
			System.out.println("lower");
		}else {
			System.out.println("not alphabet");
		}
		sc.close();


	}

}
