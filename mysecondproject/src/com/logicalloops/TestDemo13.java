package com.logicalloops;

import java.util.Scanner;

public class TestDemo13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int r=0;
		int temp=n;
		int decimal=0;
		int base=1;
		while(n>0) {
			r=n%10;
			decimal=decimal+(r*base);
			base=base*2;
			n=n/10;
	
		}
		System.out.println("decimal  number:"+decimal);
		
	}

}
