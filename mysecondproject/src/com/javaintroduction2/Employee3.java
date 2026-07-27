package com.javaintroduction2;

public class Employee3 {
	String EmpName;
	int BasicSalary;
	int Bonus;
	int Tax;
	int finalSalary;
	{
		EmpName = "Suresh";
		BasicSalary = 30000;
		Bonus = 5000;
		Tax = 2000;
	}

	void calculate() {
		finalSalary=BasicSalary+Bonus-Tax;
				System.out.println("Employee Name:"+EmpName);
				System.out.println("Basic Salary:"+BasicSalary);
				System.out.println("Bonus:"+Bonus);
				System.out.println("Tax:"+Tax);
				System.out.println("Final Salary:"+finalSalary);
		
		
	}

	public static void main(String[] args) {
		Employee3 t=new Employee3();
		t.calculate();

	}

}
