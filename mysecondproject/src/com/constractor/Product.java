package com.constractor;

public class Product {
	int productId;
	String productName;
	int productPrice;
	Product(int productId,String productName,int productPrice){
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
		
	}

	public static void main(String[] args) {
		Product h=new Product(101,"vivo",12000);
		h.Show();
		

	}
	void Show() {
		System.out.println("Product details");
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(productPrice);
	}

}
