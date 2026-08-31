package com.logicalstatements;

import java.util.Scanner;

public class Atm {
	int pin;
	void checkPin() {
		if(pin==1234) {
			System.out.println("youre pin sucess next process");
			
		}else {
			System.out.println("Invalid pin");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Atm a=new Atm();
		a.checkPin();
		

	}

}
