package com.logicalloops;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++) {
				if(n%i==0) {
					sum=sum+i;
				}
		}
				if(sum==n) {
					System.out.println("is perfect number");
				}else {
					System.out.println("is not perfect number");
				}

		sc.close();
	}

}
