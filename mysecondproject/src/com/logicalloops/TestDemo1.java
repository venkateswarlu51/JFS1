package com.logicalloops;

import java.util.Scanner;

public class TestDemo1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr number:");
		int n=sc.nextInt();
		isfactors(n);
		
	}

	private static void isfactors(int n) {
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
	}
	}
}


