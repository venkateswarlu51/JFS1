package com.logicalloops;
//wap to print large number
import java.util.Scanner;

public class TestDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int n = sc.nextInt();
		int digits = 0;
		int max = 0;
		while (n > 0) {
			digits = n % 10;
			n = n / 10;
			if (digits > max) {
				max = digits;
			}

		}
		System.out.println("maxmium number:" + max);
	}

}
