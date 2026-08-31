package com.logicalloops;
//wap to print swapping first value and last value
import java.util.Scanner;

public class TestDemo5 {


	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int temp = num;
	        int digits = 0;

	        // Count digits
	        while (temp > 0) {
	            digits++;
	            temp = temp / 10;
	        }

	        int power = 1;
	        for (int i = 1; i < digits; i++) {
	            power = power * 10;
	        }

	        int first = num / power;
	        int last = num % 10;

	        int middle = (num % power) / 10;

	        int result = last * power + middle * 10 + first;

	        System.out.println("After Swapping = " + result);
	    }
	}

