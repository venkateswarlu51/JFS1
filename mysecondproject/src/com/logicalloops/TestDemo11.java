package com.logicalloops;

import java.util.Scanner;

public class TestDemo11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter secound number:");
		int b=sc.nextInt();
		int max=(a>b)?a:b;
		while(true) {
			if(max%a==0 && max%b==0) {
				System.out.println("LCF="+max);
				break;
			}
			max++;
		}
		
	}

}
