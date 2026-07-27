package com.javaintroduction2;

import java.math.BigDecimal;
import java.math.BigInteger;

//object data types
public class TestDemo3 {
	// pre-defind object data types
	String str = "venky";// String Literal store scp(string constant pool)
	String str1 = new String("venky1");// string object
	StringBuffer str3 = new StringBuffer("java"); // Type mismatch: cannot convert from String to StringBuffer
	StringBuilder str2 = new StringBuilder("jai");
	BigInteger a = new BigInteger("83788362673267677267267682886632");// Type mismatch: cannot convert from int to
																		// BigInteger
	BigInteger b = new BigInteger("6");
	BigDecimal c = new BigDecimal("77667.6");
	BigDecimal d = new BigDecimal("77778.8");
	// wrapper object data types
	Integer i = 10;// Auto boxing:convert to primitive data type to wrapper data type
	Float f = 17f;
	Boolean boo = true;
	// Auto unboxing:convert to wrapper data type to primitive data type
	int i2 = i;
	float f2 = f;
	boolean bo = boo;

	public static void main(String[] args) {
		TestDemo3 t = new TestDemo3();
		System.out.println(t.str);
		System.out.println(t.str3);
		System.out.println(t.str2);
		System.out.println(t.a);
		System.out.println(t.b);
		// System.out.println(t.a+t.b);//The operator + is undefined for the argument
		// type(s) java.math.BigInteger, java.math.BigInteger
		System.out.println(t.a.add(t.b));// use pre-defind methods
		System.out.println(t.c);
		System.out.println(t.d);
		System.out.println(t.c.multiply(t.d));
		System.out.println(t.i);
		System.out.println(t.f);
		System.out.println(t.boo);
		System.out.println(t.i2);

		System.out.println(t.f2);

		System.out.println(t.bo);

	}

}
