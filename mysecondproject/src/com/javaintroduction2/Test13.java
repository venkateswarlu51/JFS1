package com.javaintroduction2;
import java.util.Scanner;
public class Test13 {
	double findRectangleArea(double length,double bredth) {
		double Area=length*bredth;
		return Area;
	}
	double findCircle(double radius) {
		double c=Math.PI*radius*radius;
		return c;
	}
	double findSquare(double sides) {
		double f=sides*sides;
		return f;
	}
	double findTriangle(double base,double height) {
		double g=0.5*base*height;
		return g;
	}
	public static void main(String[] args) {
		Test13 y=new Test13();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length:");
		double f=sc.nextDouble();
		System.out.println("Enter Bredth:");
		double h=sc.nextDouble();
		double t=y.findRectangleArea(f, h);
		System.out.println("Rectangle area:"+t);
		System.out.println("************************************");
		System.out.println("Enter Radius:");
		double g=sc.nextDouble();
		double u=y.findCircle(g);
		System.out.println("find the Circle:"+u);
		System.out.println("**************************************");
		System.out.println("Enter Sides:");
		double k=sc.nextDouble();
		double p=y.findSquare(k);
		System.out.println("find the Circle:"+p);
		System.out.println("*******************************************");
		System.out.println("Enter Base:");
		double w=sc.nextDouble();
		System.out.println("Enter Height:");
		double l=sc.nextDouble();
		double i=y.findTriangle(w,l);
		System.out.println("Traingle:"+i);

	}

}
