package com.logicalstatements;

import java.util.Scanner;

public class FoodDeliveryApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int price = 0;
		int quantity=0;
		int total=0;

		System.out.println("===== FOOD DELIVERY APP =====");
		System.out.println("1. Domino's");
		System.out.println("2. KFC");
		System.out.println("3. McDonald's");
		System.out.print("Enter Restaurant Name: ");
		String restaurant = sc.next();

		switch (restaurant) {

		case "Domino's" -> {
			System.out.println("welcome to Domino's");
			System.out.println("\n--- Domino's Menu ---");
			System.out.println("veg");
			System.out.println("nonveg");
			System.out.print("Select Category: ");
			String item = sc.next();

			switch (item) {

			case "veg" -> {
				System.out.println("*****veg menu**********");
				System.out.println("vegpizza");
				System.out.println("cheesepizza");
				System.out.print("Select Item: ");
				String item1 = sc.next();

				switch (item1) {

				case "vegpizza" -> {
					price = 250;
					System.out.println("You selected Veg Pizza");
				}

				case "cheesepizza" -> {
					price = 350;
					System.out.println("You selected Cheese Pizza");
				}

				default -> System.out.println("Item Not Available");
				}
			}

			case "nonveg" -> {
				System.out.println("*********non veg menu*********8");
				System.out.println("chickenbiriyani");
				System.out.println("muttonbiriyani");
				System.out.print("Select Item: ");
				String item2 = sc.next();

				switch (item2) {

				case "chickenbiriyani" -> {
					price = 300;
					System.out.println("You selected Chicken Biriyani");
				}

				case "muttonbiriyani" -> {
					price = 500;
					System.out.println("You selected Mutton Biriyani");
				}

				default -> System.out.println("Item Not Available");
				}
			}

			default -> System.out.println("Invalid Category");
			}
		}
		case "KFC" -> {
			int veg=0;
			int nonVeg=0;
		
			System.out.println("Welcome to KFC");
			System.out.println("***KFC menu***********");
			System.out.println("veg");
			System.out.println("nonveg");
			System.out.print("Select Category: ");
			String item = sc.next();
			switch (item) {
			case "veg" -> {
				System.out.println("****veg items**");
				System.out.println("vegburger-₹500");
				System.out.println("vegwrap-₹300");
				System.out.print("Select Item: ");
				String item1 = sc.next();
				switch (item1) {
				case "vegburger" -> {
					price = 500;
					System.out.println("you selected vegburgger");

				}
				case "vegwrap" -> {
					price = 300;
					System.out.println("you selected vegwrap");
				}
				default ->System.out.println("invalid item");
				}
				System.out.println("\n===== VEG BILL =====");
				System.out.println("Price : ₹" + price);
				System.out.print("Enter Quantity: ");
				quantity = sc.nextInt();
				System.out.println("Quantity : " + quantity);
				total = price * quantity;
				System.out.println("Total Bill : ₹" + total);
				System.out.println("****non veg items*********");
				System.out.println("1.chiken biriyani-₹500");
				System.out.println("2.matton biriyani-₹700");
				System.out.println("selcet item:");
				String item4 = sc.next();
				switch (item4) {
				case "chikenbiriyani" -> {
					price = 500;
					System.out.println("youb selected chiken biriyani");
				}
				case "mattonbiriyani" -> {
					price = 700;
					System.out.println("youb selected metton biriyani");
				}
				default ->System.out.println("not availble");
				}
			}
			default ->System.out.println("invalid category");
			}
		
		}

			


		default -> System.out.println("Invalid Restaurant");
		}
		if (price > 0) {
			System.out.print("Enter Quantity: ");
			quantity = sc.nextInt();

			total = price * quantity;

			System.out.println("\n===== NONs VEG BILL =====");
			System.out.println("Price : ₹" + price);
			System.out.println("Quantity : " + quantity);
			System.out.println("Total Bill : ₹" + total);
			System.out.println("Order Placed Successfully!");
		}
		total=total+total;
		System.out.println("total bill:"+total);
		

		sc.close();
		

	}
		}