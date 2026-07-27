package com.constractor;

public class Book1 {
	int bookId;
	String title;
	String Author;
	Book1(int bookId,String title){
		this.bookId=bookId;
		this.title=title;
	}
	Book1(Book1 a,String Author){
		System.out.println("**************");
		this.bookId=a.bookId;
		this.title=a.title;
		
		this.Author=Author;
	}
	void display() {
		System.out.println("book id:"+bookId);
		System.out.println("title:"+title);
		System.out.println("Author:"+Author);

	}

	public static void main(String[] args) {
		Book1 a=new Book1(101,"give up");
		a.display();
		Book1 g=new Book1(a,"give");
		g.display();
		
		

	}

}
