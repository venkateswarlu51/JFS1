package com.javaintroduction2;

public class Shoppingcart {
	void addItem(String itemName,int quantity) {
		System.out.println("item name:"+itemName);
		System.out.println("item quatity:"+quantity);
	}

	public static void main(String[] args) {
		Shoppingcart s=new Shoppingcart();
		s.addItem("iphone", 1);
		

	}

}
