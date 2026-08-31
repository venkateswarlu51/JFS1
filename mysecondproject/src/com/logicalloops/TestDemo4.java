package com.logicalloops;

import java.util.Scanner;

public class TestDemo4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		isFibancci(n);
	}

	private static void isFibancci(int n) {
		int n1=0;
		int n2=1;
		int n3=0;
		for(int i=1;i<n;i++) {
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
