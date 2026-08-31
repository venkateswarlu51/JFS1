package com.arrays;

public class Test13 {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 13 }, 
						{ 4, 5, 6 },
						{ 2, 8, 2 } };
		int n = arr.length;
		int sum = 0;
		int sum2=0;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {
				if (i == j) {
					sum = sum + arr[i][j];

				}
				if(i==n-j-1) {
					sum2=sum2+arr[i][j];
				}

			}

		}
		System.out.println(sum2);
		System.out.println(sum);

	}
}
