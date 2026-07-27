package com.javaintroduction2;

public class Employee1 {
	static int EmployeeId=5001;
	String EmployeeName;
	int  EmployeeSalary;
	{
		EmployeeId++;
		
	}
	void show() {
		System.out.println("EmployeeId:"+EmployeeId);
		System.out.println("EmployeeName:"+EmployeeName);
		System.out.println("EmployeeSalary:"+EmployeeSalary);
	}

	public static void main(String[] args) {
		
		Employee1 t = new Employee1();
		t.EmployeeName="venky";
		t.EmployeeSalary=100;
		t.show();
		System.out.println("-----------------------------");	
		Employee1 t1 = new Employee1();

		t1.EmployeeName="sai";
		t1.EmployeeSalary=98;
		t1.show();
		System.out.println("----------------------------");
		Employee1 t3 = new Employee1();
		t3.EmployeeName="guru";
		t3.EmployeeSalary=88;
		t3.show();
		

	}

}
