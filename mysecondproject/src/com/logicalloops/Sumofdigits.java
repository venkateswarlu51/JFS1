package com.logicalloops;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		System.out.println("sum of digits:"+sum);
		
	}

}
