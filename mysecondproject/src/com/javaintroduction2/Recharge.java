package com.javaintroduction2;

public class Recharge {
	void showplanDetails() {
		System.out.println("output for no arguments current Recharge plan");
		System.out.println("Plan name: Unlimmited 299");
		System.out.println("validity : 28 days");
		System.out.println("Data :1.5GB/day");
		System.out.println("Calls:Unlimited");
	}
	void recharges(double amount) {
		System.out.println("Recharge successful");
		System.out.println("Recharge amount:"+amount);
		showplanDetails();
	}

	public static void main(String[] args) {
		Recharge r=new Recharge();
		r.recharges(299);
		

	}

}
