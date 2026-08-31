package com.logicalloops;

import java.util.Scanner;
//WAP PROGRAM TO PRINT FACTORIAL OF GIVEN NUMBER USING FOR LOOP
public class FactorialOf {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>0;i--) {
			fact=fact*i;
		}  
		System.out.println("factorial number:"+fact);
	}

}
