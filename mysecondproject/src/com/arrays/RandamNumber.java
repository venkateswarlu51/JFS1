package com.arrays;

import java.util.Random;
import java.util.Scanner;

public class RandamNumber{

	public static void main(String[] args) {

		Random random = new Random();
		Scanner sc = new Scanner(System.in);

		int n = random.nextInt(1, 11);
		int chances = 3;

		System.out.println("Guess the number between 1 and 10");

		while (chances > 0) {

			System.out.println("Enter number:");
			int guess = sc.nextInt();

			if (guess == n) {
				System.out.println("You won");
				break;

			} else {
				chances--;
				System.out.println("Try again");
				System.out.println("Chances left: " + chances);
			}
		}

		if (chances == 0) {
			System.out.println("better luck next time");
			System.out.println("Random number was: " + n);
		}

		sc.close();
	}
}