package com.javaintroduction2;
import java.util.Scanner;
public class Test16 {
	String getname() {
		Scanner sc=new Scanner(System.in);
		System.out.println("with return type  + no arguments called ");
		String s=sc.next();
		return s;
	}

	public static void main(String[] args) {
		Test16 h=new Test16();
		String y=h.getname();
		System.out.println("name:"+y);
		
	}

}
