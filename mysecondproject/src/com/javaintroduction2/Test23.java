package com.javaintroduction2;
import java.util.Scanner;
public class Test23 {
	int Sq(int num) {
		int a=num*num;
		return a;
	}
	public static void main(String[] args) {
		Test23 n=new Test23();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Number");
		int b=sc.nextInt();
		int a=n.Sq(b);
		System.out.println("Square:"+a);
		sc.close();
		
		
		

	}

}
