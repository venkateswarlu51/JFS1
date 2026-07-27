package com.constractor;

public class Car1 {
	String Brand;
	String model;
	double price;
	Car1(){
		System.out.println("no org constructor called");
	}
	Car1(String Brand,String model,double price){
		this.Brand=Brand;
		this.model=model;
		this.price=price;
	}
	void display() {
		System.out.println("******************");
		System.out.println("Brand:"+Brand);
		System.out.println("model:"+model);
		System.out.println("price:"+price);

	}

	public static void main(String[] args) {
		Car1 i=new Car1();
		i.display();
		Car1 r=new Car1("rx100","Tvs",100000.00);
		r.display();
		

	}

}
