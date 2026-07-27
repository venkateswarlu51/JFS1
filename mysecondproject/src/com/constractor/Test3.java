package com.constractor;
class Vechaile{
	int vNo;
	String vName;
	
}
class Bike extends Vechaile{
	String cBrand;
	double cPrice;
	String cmodel;
	

void display() {
	System.out.println("*********vechaile Info**********");
	System.out.println("Vechaile No:"+vNo);
	System.out.println("Vechaile No:"+vName);

}
void show() {
	System.out.println(" brand :"+cBrand);
	System.out.println(" price :"+cPrice);

	System.out.println(" model:"+cmodel);

}

}

public class Test3 {

	public static void main(String[] args) {
		Bike t=new Bike();
		t.display();
		

	}

}
