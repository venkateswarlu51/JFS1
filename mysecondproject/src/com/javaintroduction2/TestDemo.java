package com.javaintroduction2;

public class TestDemo {
	String str1="100";
	int num=Integer.parseInt(str1);//object methods
	String str2="100";
	double d=Double.parseDouble(str2);
	String str3="true";
	boolean b=Boolean.parseBoolean(str3);
	char a='A';
	String c=Character.toString(a);
	
	
	
	

	public static void main(String[] args) {
		TestDemo n= new TestDemo();
		System.out.println(n.num);
		System.out.println(n.d);
		System.out.println(n.b);
		System.out.println(n.a);
			
	}

}
