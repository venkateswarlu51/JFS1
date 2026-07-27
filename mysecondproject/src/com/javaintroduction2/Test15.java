package com.javaintroduction2;
import java.util.Scanner;
public class Test15 {
	void getName() {
		System.out.println("No reuturn type +no arguments called");
	}
	void getAge(int Age) {
		System.out.println(" with return type + no arguments called");
		System.out.println("age:"+Age);
	}
	
	public static void main(String[] args) {
		Test15 g=new Test15();
		g.getName();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		int f=sc.nextInt();
		
		g.getAge(f);

		sc.close();

	}

}
