package com.logicalloops;
//WAP TO PRINT GIVEN NUMBER PERFECT OR NOT...?
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		boolean status=isPerfect(n);
		if(status) {
			System.out.println("is perfect number");
		}else {
			System.out.println("is not perfect number");
		}
		}

	private static boolean isPerfect(int n) {
		int sum=0;
		if(n==1) {
			return true;
		}
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			if(sum==n) {
				return true;
			}
	}
		return false;
	}

}
