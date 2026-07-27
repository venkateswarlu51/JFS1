package com.operators;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("verify pin:");
		int gt=sc.nextInt();
		System.out.println("enter withdra limi");
		int h=sc.nextInt();
		System.out.println("enter balance");
		int balance=sc.nextInt();
		if(gt==1234) {
			if(h==2) {
				if(balance>1000) {
					System.out.println("sucessfull completed withdrawal");
				}
				sc.close();
			}
			
		}
	}

}
