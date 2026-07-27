package com.javaintroduction2;

class Employee45 {
	int Eid;
	String Ename;
	double Esalary;

}

public class Test11 {

	void get(Employee45 s) {
		System.out.println("enter Eid:"+s.Eid);
		System.out.println("enter Ename:"+s.Ename);
		System.out.println("enter Esalary:"+s.Esalary);


	}

	public static void main(String[] args) {
		Test11 t = new Test11();
		Employee45 s = new Employee45();
		s.Eid = 101;
		s.Ename = "venky";
		s.Esalary = 2345;
		t.get(s);

	}

}
