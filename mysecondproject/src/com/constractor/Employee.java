package com.constractor;

public class Employee {
	int empId;
	String empName;
	double salary;
	Employee(int empId,String empName,double salary){
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	void display() {
		System.out.println("employee Id:"+empId);
		System.out.println("employee Name:"+empName);
		System.out.println("employee salary:"+salary);

	}
	
	

	public static void main(String[] args) {
		Employee u=new Employee(101,"venky",10000.00);
		u.display();

	}

}
