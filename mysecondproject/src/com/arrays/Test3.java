package com.arrays;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		int[][] arr= {{1,2},{3,4}};
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println(sum);
		
	}

}
