package com.javaintroduction2;

public class Chocolate {
	

	public static void main(String[] args) {
		int Cost=18;
		int total=366;
		
		int totalChocolate=total/Cost;
		int free=totalChocolate/5;
		int add=totalChocolate+free;
		int remainingAmount=total % Cost;
		
		System.out.println("total purches chocolte:"+totalChocolate);
		System.out.println("free chocalte:"+free);
		System.out.println("total chocolate:"+add);
		System.out.println("remainingAmount:"+remainingAmount);
		
	
	}

}
