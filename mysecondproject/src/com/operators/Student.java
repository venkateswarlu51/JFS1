package com.operators;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter perecentage");
		int p=sc.nextInt();
		if(p>=75) {
			System.out.println("eligible");
		}else{
			System.out.println("not");
		}
		System.out.println("enter age");
		int h=sc.nextInt();
		if(h<12) {
			System.out.println("Availble");
			
		}else {
			System.out.println("not");
			
		}
		System.out.println("enter amount");
		int amount=sc.nextInt();
		if(amount>=1000) {
			System.out.println("requaired");
		}else {
			System.out.println("not requaired");
		}
	}

}
