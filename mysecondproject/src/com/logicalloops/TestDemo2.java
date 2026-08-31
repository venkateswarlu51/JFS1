package com.logicalloops;

import java.util.Scanner;

public class TestDemo2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int fact=isfactorial(n);
		System.out.println("factorial numbers:"+fact);
	}

	private static int isfactorial(int n) {
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
		}
		return fact;
		
	}

}
