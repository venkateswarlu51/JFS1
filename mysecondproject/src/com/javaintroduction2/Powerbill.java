package com.javaintroduction2;
import java.util.Scanner;
public class Powerbill {
	void calculateBill() {
		Scanner sc=new Scanner(System.in);
		System.out.println("cusmer Name:");
	    String coustmer=sc.next();
	    System.out.println("unit custmized:");
	    
	    int units=sc.nextInt();
	    int perunitcost=5;
	    int totalbill=units*perunitcost;
	    System.out.println("custemer Name:"+coustmer);
	    System.out.println("units :"+units);
	    System.out.println("total bill:"+totalbill);
	    sc.close();
		
	}

	public static void main(String[] args) {
		Powerbill p=new Powerbill();
		p.calculateBill();

		

	}

}
