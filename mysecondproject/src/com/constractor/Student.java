package com.constractor;

public class Student {
	String sName;
	int srollNo;
	int sMarks;
	Student(){
		sName="venky";
		srollNo=101;
		sMarks=300;
	}
	void display() {
		System.out.println("Student Name:"+sName);
		System.out.println("Student roll Number:"+srollNo);
		System.out.println("Student Marks:"+sMarks);

	}
	
	

	public static void main(String[] args) {
		Student y=new Student();
		y.display();

	}

}
