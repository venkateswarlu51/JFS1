package com.constractor;

public class Test {
	int eId;
	String eName;
	double eSalary;
	int eAge;
	Test(){
		System.out.println("no org constrctor called");
		eId=101;
		eName="venky";
		eSalary=120000.00;
		eAge=25;
		
	}
	Test(int eId,String eName,double eSalary,int eAge){
		System.out.println("parameterized constrctor called");
		this.eId=eId;
		this.eName=eName;
		this.eSalary=eSalary;
		this.eAge=eAge;
		
		
		
	}

	public static void main(String[] args) {
		Test h=new Test();
		h.display();
		Test y=new Test(101,"venky",30000.00,67);
		y.display();
		
		

	}
	void display() {
		System.out.println("employee Id:"+eId);
		System.out.println("employee Id:"+eName);
		System.out.println("employee Id:"+eSalary);
		System.out.println("employee Id:"+eAge);

	}

}
