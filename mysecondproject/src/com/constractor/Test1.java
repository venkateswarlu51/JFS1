package com.constractor;

public class Test1 {
	int sid;
	String sName;
	int sAge;
	double sSalary;
	int sHight;
	Test1(int sid,String sName,int sAge,double sSalary,int sHight){
		System.out.println("Constrctor called");
		this.sid=sid;
		this.sName=sName;
		this.sAge=sAge;
		this.sSalary=sSalary;
		this.sHight=sHight;
	}
	Test1(){
		System.out.println("no-org constrctor called");
	}

	public static void main(String[] args) {
		Test1 j=new Test1();
		j.show();
		Test1 g=new Test1(1,"venky",22,4500.0,6);
		g.show();
		

	}
	void show() {
		System.out.println(sid);
		System.out.println(sName);
		System.out.println(sAge);
		System.out.println(sSalary);
		System.out.println(sHight);

	}

}
