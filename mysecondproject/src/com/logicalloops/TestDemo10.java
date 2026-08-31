package com.logicalloops;
//HCF
import java.util.Scanner;

public class TestDemo10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int n1=sc.nextInt();
		System.out.println("enter secound number:");
		int n2=sc.nextInt();
		int hcf=1;
		for(int i=1;i<=n1 && i<=n2;i++) {
			if(n1%i==0 && n2%i==0) {
				hcf=i;
			}
		}
		System.out.println("HCf :"+hcf);
	}

}
