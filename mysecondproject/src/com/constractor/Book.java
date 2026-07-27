package com.constractor;

public class Book {
	String Title;
	String Author;
	int price;
	Book(){
		Title="java";
		Author="james";
		price=500;
	}
	void display() {
		System.out.println("Title:"+Title);
		System.out.println("Author:"+Author);
		System.out.println("price:"+price);

	}

	public static void main(String[] args) {
		Book b=new Book();
		b.display();

	}

}
