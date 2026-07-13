package com.javaintroduction2;

public class Car {
	String CarName;
	String model;
	int price;
	{
		CarName="bmw";
		model="x5";
		price=750000;
	}
	void car() {
		System.out.println("Car Name:"+CarName);
		System.out.println("Car Model:"+model);
		System.out.println("car price:"+price);
	}

	public static void main(String[] args) {
		Car t=new Car();
		t.car();
		
	}

}
