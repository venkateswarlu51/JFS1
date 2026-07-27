package com.javaintroduction2;

public class Product {
	String proName;
	int price;
	int discount;
	int finalPrice;
	{
		proName="Moblile";
		price=20000;
		discount=10;
		finalPrice=price-(price*discount/100);
		System.out.println("Product Name:"+proName);
		System.out.println("Original price:"+price);
		System.out.println("discount:"+discount);
		System.out.println("final price:"+finalPrice);
	}

	public static void main(String[] args) {
		Product t =new Product();
		
	}

}
