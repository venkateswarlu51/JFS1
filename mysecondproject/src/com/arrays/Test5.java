package com.arrays;

public class Test5 {

	public static void main(String[] args) {
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		int n=arr.length;
		int sum=0;
		int max=arr[0][0];
		int min=arr[0][0];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				sum=sum+arr[i][j];
				if(arr[i][j]>max) {
				max=arr[i][j];
			}
			if(arr[i][j]<min) {
				min=arr[i][j];
				
			}
		}
		}
		System.out.println("sum of elements:"+sum);
		System.out.println("maximun elements in array:"+max);
		System.out.println("minimum element in array:"+min);
	}

}
