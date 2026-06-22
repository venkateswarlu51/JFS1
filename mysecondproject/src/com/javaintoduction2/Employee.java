package com.javaintoduction2;

public class Employee {
	static String organizationName;
	int empId;
	String empName;
	float empSalery;
	String deprtName;

	public static void main(String[] args) {
		System.out.println("Employee Info");
		organizationName ="Vcube";
		System.out.println("organiztion Name:"+organizationName);
		

		
		Employee e1 = new Employee();
		e1.empId = 10;
		e1.empName = "venky";
		e1.empSalery = 10000;
		e1.deprtName = "wora";
		System.out.println("Employee Id:"+e1.empId);
		System.out.println("Employee Name:"+e1.empName);
		System.out.println("Employee Salery:"+e1.empSalery);
		System.out.println("Employee deprtName:"+e1.deprtName);
		System.out.println("-----------------------------------------");
		Employee e2 = new Employee();
		
		e2.empId = 11;
		e2.empName = "ramu";
		e2.empSalery = 90000;
		e2.deprtName = "IKEA";
		System.out.println("Employee Id:"+e2.empId);
		System.out.println("Employee Name:"+e2.empName);
		System.out.println("Employee Salery:"+e2.empSalery);
		System.out.println("Employee deprtName:"+e2.deprtName);
		
	}

}
