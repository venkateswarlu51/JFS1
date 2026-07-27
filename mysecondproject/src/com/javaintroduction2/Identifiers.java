package com.javaintroduction2;

public class Identifiers {
	String studentName="venky";//Syntax error on token "class", invalid VariableDeclaratorId
	int student_age=22;
	int $Salary=2344003;//The literal 2344003557 of type int is out of range 
	int rollNo=2;
	

	public static void main(String[] args) {
		Identifiers n=new Identifiers();
		System.out.println(n.studentName);
		System.out.println(n.student_age);

		System.out.println(n.$Salary);
		System.out.println(n.rollNo);
		byte b=127;
		b++;
		System.out.println(b);
		//char c=c;//The local variable c may not have been initialized
		//char c='65';Invalid character constant
		char c=68;
		++c;
		System.out.println(c);
		


	

	}

}
