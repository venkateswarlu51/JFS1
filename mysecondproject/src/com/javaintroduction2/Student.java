package com.javaintroduction2;

public class Student {
	static int studentId=101;
	String studentName;
	int  studentMarks;
	public char[] rollNo;
	{
		studentId++;
	}
	void show() {
		System.out.println("studentId:"+studentId);
		System.out.println("studentName:"+studentName);
		System.out.println("studentMarks:"+studentMarks);
	}

	public static void main(String[] args) {
		
		Student t = new Student();
		t.studentName="venky";
		t.studentMarks=100;
		t.show();
		System.out.println("-----------------------------");	
		Student t1 = new Student();

		t1.studentName="sai";
		t1.studentMarks=98;
		t1.show();
		System.out.println("----------------------------");
		Student t3 = new Student();
		t3.studentName="guru";
		t3.studentMarks=88;
		t3.show();
		

	}

}
