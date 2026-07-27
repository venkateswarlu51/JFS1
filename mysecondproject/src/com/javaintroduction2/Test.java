package com.javaintroduction2;

public class Test {
	String stuName;
	int stuAge;
	String stuCourse;
	{
		stuName="venky";
		stuAge=22;
		stuCourse="java";
	}
	void details(){
		System.out.println("stuName :"+stuName);
		System.out.println("stuAge:"+stuAge);
		System.out.println("stuCourse:"+stuCourse);
		
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.details();
		
	}

}
