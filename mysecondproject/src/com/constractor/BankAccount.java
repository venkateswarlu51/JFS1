package com.constractor;

public class BankAccount {
	int accountNumber;
	String holderName;
	double balance;
	double deposite;
	
	BankAccount(){
		System.out.println("no org  constractor called");
	}
	BankAccount(int accountNumber){
		System.out.println("parameterized constrctor called");
		this.accountNumber=accountNumber;
	}
	BankAccount(BankAccount u,String holderName){
		System.out.println("********************");
		this.accountNumber=u.accountNumber;
		this.holderName=holderName;
	}
	BankAccount(BankAccount y,double balance){
		System.out.println("****************************");
		this.accountNumber=y.accountNumber;
		this.holderName=y.holderName;
		this.balance=balance;
	}
	BankAccount(BankAccount p){
		System.out.println("****************************");
		this.accountNumber=p.accountNumber;
		this.holderName=p.holderName;
		this.balance=p.balance;
	}
	void deposite(int amount) {
		balance=balance+amount;
		
	}

	public static void main(String[] args) {
		BankAccount t=new BankAccount();
		t.display();
		BankAccount u=new BankAccount(56785445);
		u.display();
		BankAccount y=new BankAccount(u,"venky");
		y.display();
		BankAccount i=new BankAccount(y,1000.00);
		i.display();
		BankAccount p=new BankAccount(i);
		p.deposite(100);
		p.display();
		
		
		

	}
	void display() {
		System.out.println(" account Number:"+accountNumber);
		System.out.println(" Holder name:"+holderName);
		System.out.println(" balance :"+balance);

	}

}
