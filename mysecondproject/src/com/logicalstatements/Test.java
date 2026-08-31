package com.logicalstatements;

import java.util.Scanner;

public class Test {

	    int correctPin = 1234;
	    int balance = 50000;
	    int dailyLimit = 20000;
	    int dailyWithdrawn = 0;
	     boolean checkPin(int pin) {

				if (pin == correctPin) {
				    return true;
				} else {
				    return false;
				}
			} 

	    // Check Balance method
	    void checkBalance(int amount) {

	        if (amount <= balance) {
	            System.out.println("Sufficient Balance");
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }

	    // Withdraw method
	    void withdraw(int amount) {

	        if (amount <= (dailyLimit - dailyWithdrawn)) {

	            if (amount <= balance) {

	                balance = balance - amount;
	                dailyWithdrawn = dailyWithdrawn + amount;

	                System.out.println("Withdrawal Successful");
	                System.out.println("Withdrawn Amount : " + amount);
	                System.out.println("Remaining Balance : " + balance);
	                System.out.println("Daily Limit Remaining : " 
	                                   + (dailyLimit - dailyWithdrawn));

	            } else {
	                System.out.println("Insufficient Balance");
	            }

	        } else {
	            System.out.println("Daily Withdrawal Limit Exceeded");
	        }
	    }


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Test atm = new Test();

	        int choice;

	        do {

	            System.out.print("\nEnter ATM PIN: ");
	            int pin = sc.nextInt();

	            if (atm.checkPin(pin)) {

	                System.out.println("PIN Correct");

	                System.out.print("Enter Withdrawal Amount: ");
	                int amount = sc.nextInt();

	                atm.checkBalance(amount);
	                atm.withdraw(amount);

	            } else {

	                System.out.println("Invalid PIN");
	                System.out.println("Transaction Failed");

	            }

	            System.out.print("\nDo you want another transaction? (1-Yes / 0-No): ");
	            choice = sc.nextInt();

	        } while (choice == 1);


	        System.out.println("Thank you for using ATM");

	        sc.close();
	    }
	}