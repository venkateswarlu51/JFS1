package com.logicalstatements;

import java.util.Scanner;



public class Test2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int num=sc.nextInt();
		if(num%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		System.out.println("enter number");
		int nu=sc.nextInt();
		if(nu>0) {
			System.out.println("positive");
			
		}else if(nu<0) {
			System.out.println("negative");
		}else if(nu==0) {
			System.out.println("zero");
		}
		sc.close();
		

	}

}
