package com.logicalloops;

import java.util.Scanner;

public class Test5 {
	static int sum;
	static void factor(int n) {
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				sum=sum+i;
				
			}
		}
		System.out.println(sum); 
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		factor(n);
		sc.close();
		
	}

}
