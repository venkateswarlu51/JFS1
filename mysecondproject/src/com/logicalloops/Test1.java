package com.logicalloops;
//find the even numbers in given n'th range
import java.util.Scanner;

public class Test1 {
	static void rangeNumber(int n) {
		for(int i=0;i<=n;i=i+2) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number:");
		int n=sc.nextInt();
		rangeNumber(n);
		sc.close();

	}
	

}
