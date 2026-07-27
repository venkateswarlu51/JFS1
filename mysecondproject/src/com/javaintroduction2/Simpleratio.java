package com.javaintroduction2;

public class Simpleratio {
	int prinicipale;
	int rate;
	int time;
	int simpleinterest;
	{
		prinicipale=10000;
		rate=5;
		time=2;
	}
	void calculate() {
		simpleinterest=(prinicipale*rate*time)/100;
		System.out.println("prinicipale:"+prinicipale);
		System.out.println("rate:"+rate);
		System.out.println("Time:"+time);
		System.out.println("simple interest:"+simpleinterest);
		
	}

	public static void main(String[] args) {
		Simpleratio t = new Simpleratio();
		t.calculate();
		
	}

}
