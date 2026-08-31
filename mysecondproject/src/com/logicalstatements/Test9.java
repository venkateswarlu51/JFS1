package com.logicalstatements;

import java.util.Scanner;

public class Test9 {

		    static int correctPin = 1234;
		    static int balance = 50000;
		    static int dailyLimit = 20000;
		    static int balanceCheckCount = 0;


		    // PIN Verification method
		    static boolean checkPin(int pin) {

		        if (pin == correctPin) {
		            return true;
		        } else {
		            return false;
		        }
		    }


		    // Check Balance method (only 2 times)
		    static void checkBalance(int amount) {

		        if (balanceCheckCount < 2) {

		            balanceCheckCount++;

		            if (amount <= balance) {
		                System.out.println("Sufficient Balance");
		            } else {
		                System.out.println("Insufficient Balance");
		            }

		        } else {

		            System.out.println("Balance checking limit completed");

		        }
		    }


		    // Withdraw method using nested if
		    static void withdraw(int amount) {

		        if (amount <= dailyLimit) {

		            if (amount <= balance) {

		                balance = balance - amount;

		                System.out.println("Withdrawal Successful");
		                System.out.println("Withdrawn Amount : " + amount);
		                System.out.println("Remaining Balance : " + balance);

		            } else {

		                System.out.println("Insufficient Balance");

		            }

		        } else {

		            System.out.println("Daily Withdrawal Limit Exceeded");

		        }
		    }


		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);

		        int choice;

		        do {

		            System.out.print("Enter ATM PIN: ");
		            int pin = sc.nextInt();


		            if (checkPin(pin)) {

		                System.out.println("PIN Correct");

		                System.out.print("Enter Withdrawal Amount: ");
		                int amount = sc.nextInt();


		                // Method calls from main()
		                checkBalance(amount);
		                withdraw(amount);


		            } else {

		                System.out.println("Invalid PIN");
		                System.out.println("Transaction Failed");

		            }


		            System.out.print("Do you want another transaction? (1-Yes / 0-No): ");
		            choice = sc.nextInt();


		        } while (choice == 1);


		        System.out.println("Thank you for using ATM");

		        sc.close();
		    }
		
	}


