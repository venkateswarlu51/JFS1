package com.javaintroduction2;

public class TestDemo1 {
	byte b = 127;// Type mismatch: cannot convert from int to byte because range -128 to 127
	short s = 32767;// Type mismatch: cannot convert from int to short because range is -32768 to
					// 32767
	int i = 2147483647;// The literal 2147483648 of type int is out of range because range -2147483648
						// to 2147483648
	long l = 92233720368L;;

	float f = 7783788868878888837f;// to write last f or F convert to expontial value//Type mismatch: cannot
									// convert from double to float
	double d = 7783788868878888837f;// The literal 778378886887888 of type int is out of range
	char c = 'A';
	char sg = '\u0043';// unique code
	char ss = 65;// ASCII codes
	int t = 'a';
	boolean boo = true;

	public static void main(String[] args) {
		System.out.println("main methode started");
		TestDemo1 n = new TestDemo1();
		System.out.println(n.b);
		System.out.println(n.s);
		System.out.println(n.i);
		System.out.println(n.l);
		System.out.println(n.f);
		System.out.println(n.d);
		System.out.println(n.c);
		System.out.println(n.sg);
		System.out.println(n.ss);
		System.out.println(n.t);
		System.out.println(n.boo);

	}

}
