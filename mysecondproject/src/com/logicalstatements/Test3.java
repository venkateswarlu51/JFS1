package com.logicalstatements;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter marks");
		int marks=sc.nextInt();
		if(marks>35) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		sc.close();
		

	}

}
