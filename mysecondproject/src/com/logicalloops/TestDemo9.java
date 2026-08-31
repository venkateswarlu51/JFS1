package com.logicalloops;
//wap program to print small number
import java.util.Scanner;

public class TestDemo9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int digits = 0;
		int min = 9;
		while (n > 0) {
			digits = n % 10;
			n = n / 10;
			if (digits < min) {
				min = digits;
			}

		}
		System.out.println("maxmium number:" + min);
		
	

	}

}
