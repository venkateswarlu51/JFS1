package com.logicalloops;
//nth oddnumber
import java.util.Scanner;

public class Test2 {
	static int count;
	 static int n1=0;
	static void nthOddNumber(int n) {
		for(int i=0;i<=n1;i++) {
			n1++;
			if(i%2==1) {
				count++;
				
			if(count==n) {
				System.out.println(i);
			}
			}
	}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nth number");
		int n=sc.nextInt();
		nthOddNumber(n);
		sc.close();

	}

}
