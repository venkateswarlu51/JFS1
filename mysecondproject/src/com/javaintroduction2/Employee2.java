package com.javaintroduction2;

public class Employee2 {
	String EmpName;
	int EmpSalary;
	float EmpBonus;
	float totalSalary;
	
	{
		EmpName="Ravi";
		EmpSalary=20000;
		EmpBonus=5000.5f;
		totalSalary=EmpSalary+EmpBonus;
		
	}
	void add() {
		System.out.println("Employee Name:"+EmpName);
		System.out.println("Basic Salary:"+EmpSalary);
		System.out.println("Bonus:"+EmpBonus);
		System.out.println("Total Salary:"+totalSalary);
	}
	
	
	

	public static void main(String[] args) {
		Employee2 t=new Employee2();
		t.add();

	}

}
