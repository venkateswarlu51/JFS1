package com.arrays;

public class TestDemo1 {

	public static void main(String[] args) {
		int[] arr= {1,2,4,1,2,3,3};
		int result=0;
		for(int a:arr) {
			result=result^a;
		}
		System.out.println(result);
	}

}
