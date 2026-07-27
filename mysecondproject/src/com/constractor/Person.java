package com.constractor;

public class Person {
	String name;
	int age;
	Person(){
		this("venky");
		System.out.println("no org consractor called");
	}
	Person(String name){
		this(name,22);
		System.out.println("parameterized constracter called");
		
	}
	Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	void display() {
		System.out.println("person name:"+name);
		System.out.println("person age:"+age);

	}

	public static void main(String[] args) {
		Person t=new Person();
		t.display();

	}

}
