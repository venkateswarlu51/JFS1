package com.oops;

class Employee1{
	int empId;
	String empName;
	Adress1 adress1;
	public Employee1(int empId, String empName, Adress1 adress1) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.adress1 = adress1;
	}
	public Employee1(Employee1 e) {
		this.empId=e.empId;
		this.empName=e.empName;
		this.adress1=new Adress1(e.adress1);
		
	}
	
}
class Adress1{
	String city;
	public Adress1(Adress1 a1) {
		this.city=a1.city;
	}

	public Adress1(String city) {
		super();
		this.city = city;
	}
}
	
	public class DeepCopy{

		public static void main(String[] args) {
			Adress1 a=new Adress1("podili");
			Employee1 e=new Employee1(1,"venky",a);
			System.out.println(e.empId);
			System.out.println(e.empName);
			System.out.println(e.adress1.city);
			Employee1 e1=new Employee1(e);
			System.out.println("___________________________");
			System.out.println(e1.empId);
			System.out.println(e1.empName);
			System.out.println(e1.adress1.city);
			System.out.println("_______________________________");
			e1.adress1.city="ongole";
			System.out.println(e.empId);
			System.out.println(e.empName);
			System.out.println(e.adress1.city);
			System.out.println("__________________________--");
			System.out.println(e1.empId);
			System.out.println(e1.empName);
			System.out.println(e1.adress1.city);
			
			

	}

	

}
