package com.javaintroduction2;

public class TestDemo4 {
	Integer Empno=2;
	String Ename="venky";
	Integer monthSalary=5000;
	String Hiredate="12-12-2004";
	Integer Experiance=3;
	Integer perYear=monthSalary*12;
	Integer bonus=monthSalary*10;
	Integer total=perYear+bonus;
	
	


	public static void main(String[] args) {
		TestDemo4 t= new TestDemo4();
		
		System.out.println("employee no:"+t.Empno);
		System.out.println("employee Name:"+t.Ename);

		System.out.println("employee Salary:"+t.monthSalary);

		System.out.println("employee hiredate:"+t.Hiredate);
		System.out.println("Employee experiances:"+t.Experiance);
		System.out.println("total year salary:"+t.perYear);
		System.out.println("total salary and bonus:"+ t.bonus);
		System.out.println("total bonus and salary:"+t.total);


		


		

	}

}
