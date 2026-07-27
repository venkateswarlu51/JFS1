package com.logicalstatements;

import java.util.Scanner;

public class Traingele {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first traigle:");
		int a=sc.nextInt();
		System.out.println("enter secound traigle:");
		int b=sc.nextInt();
		System.out.println("enter third traigle:");
		int c=sc.nextInt();
		
		if(a+b>c && b+c>a && c+a>b) {
			System.out.println("Traingle");
		}else {
			System.out.println("not traingle");
		}

	}

}
