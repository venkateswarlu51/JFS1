package com.logicalloops;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		boolean status=isStrong(n);
		if(status) {
			System.out.println("is Strong");
		}else {
			System.out.println("not strong");
		}
	}
	static boolean isStrong(int n) {
		int sum=0;
		int r=0;
		while(n>0) {
			r=n%10;
			sum=sum+fact(r);
			n=n/10;
			
			
		}
		System.out.println("sum of digits:"+sum);
		return false;
	}
	private static int fact(int r) {
		
		return 0;
	}

}
