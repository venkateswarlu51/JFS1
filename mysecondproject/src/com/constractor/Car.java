package com.constractor;

public class Car {
	String brand;
	int model;
	int price;
	

	public Car(String brand, int model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;
	}


	public static void main(String[] args) {
		Car c=new Car("venky",3,30000);
		c.displayDetails();

	}
	void displayDetails() {
		System.out.println("***********Car Info*****************8");
		System.out.println("Brand name"+brand);
		System.out.println("model:"+model);
		System.out.println("Price :"+price);

	}

}
