package com.logicalloops;
//neon number
import java.util.Scanner;

public class TestDemo12 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter number:");
		int n=sc.nextInt();
		int r=0;
		int temp=n;
		int sum=0;
		n=n*n;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
			
		}
		if(sum==temp) {
			System.out.println("is neon number");
		}else {
			System.out.println("is not neon number");
		}
		
	}

}
