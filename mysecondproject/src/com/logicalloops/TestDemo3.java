package com.logicalloops;

import java.util.Scanner;

public class TestDemo3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		int sum=isSum(n);
		System.out.println("sum of digits:"+sum);
	}

	private static int isSum(int n) {
		int r=0;
		int sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		return sum;
	}

}
