package com.javaintroduction2;
//no returntype + with arguments

public class Bank {
	double balance = 10000.00;

	void checkbalance() {
		System.out.println("check balance:" + balance);
	}

	void deposite(double amount) {
		balance = balance + amount;
		System.out.println("amount deposite:"+balance);
		checkbalance();
	}
	void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("withdraw amount:"+balance);
		checkbalance();
		
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Bank sbi=new Bank();
		sbi.deposite(5000.00);
		sbi.withdraw(10000.00);
	
		
		

	}

}
