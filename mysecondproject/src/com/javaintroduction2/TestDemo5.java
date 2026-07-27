package com.javaintroduction2;

public class TestDemo5 {
	void maltiplication(byte b,short s,int i,long l,float f,double d) {
		double t=b*s*i*l*f*d;
		System.out.println("maltiplication called:"+t);
	}
	void division(float f,float f1) {
		double d=f/f1;
		System.out.println("division called:"+d);
		
	}
	void madulodivision(double d1,int i1) {
		double s=d1%i1;
		System.out.println("madulodivision called:"+s);
	}

	public static void main(String[] args) {
		TestDemo5 n=new TestDemo5();
		//n.maltiplication(1,3,4,3,2,2.0);//The method maltiplication(byte, short, int, long, float, double) in the type TestDemo5 is
		//not applicable for the arguments (int, int, int, int, int, double)
		n.division(4, 2);
		n.madulodivision(23.56, 7);
		

	}

}
