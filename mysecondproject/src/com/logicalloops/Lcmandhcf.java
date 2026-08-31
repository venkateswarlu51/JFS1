package com.logicalloops;

import java.util.Scanner;

public class Lcmandhcf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int lcm=0;
		System.out.println("enter a number:");
		int a=sc.nextInt();
		System.out.println("enter b number:");
		int b=sc.nextInt();
		for(int i=0;i<=a && i<=b;i++) {
			if(a/i==0 && b/i==0) {
				 lcm=lcm*i;
			}
		}
		sc.close();
	}

}
