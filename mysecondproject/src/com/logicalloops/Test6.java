package com.logicalloops;
//1. Write a Java program to find the nth odd number.
import java.util.Scanner;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter number:");
		int n=sc.nextInt();
		for(int i=0;;i++) {
			if(i%2==1) {
				count++;
				if(count==n) {
					System.out.println(i);
					break;
				}
			}
		}
		sc.close();
		
	}

}
