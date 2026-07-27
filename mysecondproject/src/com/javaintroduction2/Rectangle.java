package com.javaintroduction2;

public class Rectangle {
	void Rectanglearea(int length,int breadth) {
		int area=length*breadth;
		System.out.println("rectangle area:"+area);
		
	}

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.Rectanglearea(2, 3);
		

	}

}
