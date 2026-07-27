package com.javaintroduction2;

public class Employee4 {
	String empName;
	int empId;
	float empSalary;
	{
		empName="venkatesh";
		empId=101;
		empSalary=50000f;
	}
	void display() {
		System.out.println("employee Name:"+empName);
		System.out.println("employee Id:"+empId);
		System.out.println("employee Salary:"+empSalary);
	}

	public static void main(String[] args) {
		Employee4 t=new Employee4();
		t.display();
		
	}

}
