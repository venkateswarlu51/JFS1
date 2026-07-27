package com.constractor;

public class Rectangle {
	double length;
	double bredth;
	
	Rectangle(){
		
	}
	Rectangle(double length){
		System.out.println("***************************");
		this.length=length;
		
	}
	Rectangle(double length,double Bredth){
		System.out.println("***********************");
		this.length=length;
		this.bredth=Bredth;
	}
	void display() {
		System.out.println("Rectangel length:"+length);
		System.out.println("Rectangle Bredth:"+bredth);
	}
	void show() {
		double area=length*bredth;
		System.out.println("area:"+area);
	}
	

	public static void main(String[] args) {
		Rectangle t=new Rectangle();
		t.display();
		Rectangle u=new Rectangle(2.00);
		u.display();
		Rectangle i=new Rectangle(4.00,6.00);
		i.display();
		i.show();
		

	}

}
