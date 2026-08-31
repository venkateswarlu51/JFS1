package com.oops;
class Employees implements Cloneable{
	int empId;
	String empName;
	Adress adress;
	protected Object clone()throws CloneNotSupportedException{ 
		return super.clone();
	}
	Employees(int empId,String empName,Adress adress){
		this.empId=empId;
		this.empName=empName;
		this.adress=adress;
	}
	
}
class Adress{
	String city;
	Adress(String city){
		this.city=city;
	}
}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Adress adress=new Adress("podili");
		Employees emp=new Employees(12,"venky",adress);
		System.out.println(emp.empId);
		System.out.println(emp.empName);
		System.out.println(emp.adress.city);
		System.out.println("________________________________");
		Employees emp1=(Employees)emp.clone();
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(emp1.adress.city);
		System.out.println("_____________________________________");
		emp1.empId=13;
		emp1.empName="sai";
		emp1.adress.city="ongole";
		System.out.println(emp.empId);
		System.out.println(emp.empName);
		System.out.println(emp.adress.city);
		System.out.println(emp1.empId);
		System.out.println(emp1.empName);
		System.out.println(emp1.adress.city);
		
	}

}
