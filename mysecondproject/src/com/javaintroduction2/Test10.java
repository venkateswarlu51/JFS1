package com.javaintroduction2;

import java.util.Scanner;

public class Test10 {
	int CalucalateTotal(int m1,int m2, int m3,int m4,int m5) {
		int total=m1+m2+m3+m4+m5;
		return total;
	}
	double calucalatePercentage(double total) {
		double total1=(total/500.0)*100.0;
		return total1;
	}
	double calculateAvarage(double total) {
		double f=total/5.0;
		return f;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m1 marks");
		int b=sc.nextInt();
		System.out.println("enter m2 marks");
		int f=sc.nextInt();
		System.out.println("enter m3 marks");
		int h=sc.nextInt();
		System.out.println("enter m4 marks");
		int p=sc.nextInt();
		System.out.println("enter m5 marks");
		int q=sc.nextInt();
		
		Test10 g=new Test10();
		int u=g.CalucalateTotal(b, f, h, p, q);
		double j=g.calucalatePercentage(u);
		double v=g.calculateAvarage(u);
		System.out.println("total:"+u);
		System.out.println("percentage:"+j);
		System.out.println("average:"+v);
		sc.close();


		
	}

}
