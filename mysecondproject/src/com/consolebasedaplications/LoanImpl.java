package com.consolebasedaplications;

import java.util.Scanner;

public class LoanImpl implements Loan {
	static Scanner sc = new Scanner(System.in);

	public boolean isvalidPhoneNo() {
		System.out.println("Enter phone number:");
		String phone = sc.next();
		return phone.matches("[6-9]{1}[0-9]{9}");
	}

	public boolean isvalidAdhar() {
		System.out.println("Enter Adhar number:");
		String Adhar = sc.next();
		return Adhar.matches("[6-9]{1}[0-9]{11}");
	}

	public boolean isvalidPan() {
		System.out.println("Enter pan number:");
		String Pan = sc.next();
		return Pan.matches("[A-Z]{5}[1-9]{4}[A-z]{1}");
	}

	public double custemersalary() {
		System.out.println("Enter custemer Salary:");
		double salary = sc.nextDouble();
		return salary;
	}

	 public int getCustmerAge() {
		System.out.println("enter age:");
		int Age = sc.nextInt();
		return Age;
	}

	 public int getCustomercibilscore() {
		System.out.println("Enter cibli score:");
		int cibil = sc.nextInt();
		return cibil;
	}

	 public double getLoanRoi() {

		double roi = 8.5;
		double cibil = getCustomercibilscore();

		if (cibil >= 300 && cibil <= 549) {

			System.out.println("Poor – High risk borrower, most applications likely to be rejected");
			roi = roi + 4.5;

		} else if (cibil >= 550 && cibil <= 649) {

			System.out.println("Fair – Limited loan options, usually at high interest rates");
			roi = roi + 2.5;

		} else if (cibil >= 650 && cibil <= 749) {

			System.out.println("Good – Better creditworthiness and reasonable chances of approval");
			roi = roi + 1.5;

		} else if (cibil >= 750 && cibil <= 900) {

			System.out.println("Excellent – Low credit risk with strong chances of approval and better terms");
			roi = roi + 0.5;

		} else {

			System.out.println("Invalid CIBIL score, personal loan is rejected");
			roi = roi + 10.0;
		}

		return roi;
	}

}
