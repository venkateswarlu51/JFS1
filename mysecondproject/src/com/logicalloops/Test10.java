package com.logicalloops;

import java.util.Scanner;

public class Test10 {
	static int ismagic(int n) {
		int rev=0;
		int r=0;
		int sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
			rev=sum%10;
			sum=sum/10;
			sum=sum+rev;
			
			
			
	}
		System.out.println("sum of digits:"+sum);
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		ismagic(n);
		if(ismagic(n)==1) {
			System.out.println("is magic number");
			
		}else {
			System.out.println("is not magic number");
		}
		sc.close();
		
	}

}
