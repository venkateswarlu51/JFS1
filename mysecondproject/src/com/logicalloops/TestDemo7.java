package com.logicalloops;

import java.util.Scanner;

public class TestDemo7 {


	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter number");
			int n=sc.nextInt();
			int temp=n;
			int sum=0;
			int r=0;
			String str=Integer.toString(n);
			 int digits=str.length();
			while(n>0) {
				r=n%10;
				n=n/10;
				sum=(int) (sum+Math.pow(r, digits));
			}
			if(sum==temp) {
				System.out.println("is armstrong");
			}else {
				System.out.println("is not armstrongS");
				
			}
	}

}
