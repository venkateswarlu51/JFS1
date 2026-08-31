package com.logicalloops;

import java.util.Scanner;

public class TestDemo6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		boolean status=isPlaindrome(n);
		if(status) {
			System.out.println("is palindrome");
		}else {
			System.out.println("is not palindrome");
		}
	}

	private static boolean isPlaindrome(int n) {
		  int r=0;
		  int rev=0;
		  int temp=n;
		  while(n>0) {
			  r=n%10;
			  n=n/10;
			  rev=rev*10+r;
			  
		  }
		  if(rev==temp) {
			  return true;
		  }
		return false;
	}

}
