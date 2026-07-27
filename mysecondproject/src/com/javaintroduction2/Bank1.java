package com.javaintroduction2;

public class Bank1 {
	static int AccountNumber=1000;
	String CustomerName;
	int AccountBalance;
	{
		AccountNumber++;
	}
	void show() {
		System.out.println("AccountNumber:"+AccountNumber);
		System.out.println("CustemerName:"+CustomerName);
		System.out.println("AccountBalance:"+AccountBalance);
	}
	public static void main(String[] args) {
		Bank1 t = new Bank1();
		t.CustomerName="venky";
		t.AccountBalance=1000;
		t.show();
		Bank1 t1 = new Bank1();
		t1.CustomerName="sai";
		t1.AccountBalance=10000;
		t1.show();
		
		
	}

}
