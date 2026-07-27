package com.javaintroduction2;
//return type + no aruguments
import java.util.Scanner;
public class Test12 {
	static Scanner sc=new Scanner(System.in);
	double getSalary() {
		System.out.println("Enter Salary:");
		double sa=sc.nextDouble();
		return sa;
	}
	double getBonus() {
		System.out.println("Enter bonus:");
		int sas=sc.nextInt();
		return sas;
		
	}
	public static void main(String[] args) {
		Test12 y=new Test12();
		double z=y.getSalary();
		double h=y.getBonus();
		System.out.println("Total salary:"+(z+h));
		

	}

}
