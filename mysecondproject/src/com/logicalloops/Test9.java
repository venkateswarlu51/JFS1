package com.logicalloops;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter number");
				int n=sc.nextInt();
				boolean status=isPalindrom(n);
				if(status) {
					System.out.println("is palindrom");
				}else {
					System.out.println("is not palindrom");
				}
			}
			static boolean isPalindrom(int n) {
				int r=0;
				int rev=0;
				while(n>0) {
					r=n%10;
					rev=(rev*10)+r;
					n=n/10;
					
					
					
				}
				return false;
			}

}
