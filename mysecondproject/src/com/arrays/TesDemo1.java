package com.arrays;
//missing number
public class TesDemo1 {

	public static void main(String[] args) {
		int[] arr= {1,3,0};
		int n=arr.length;
		int ex=n*(n+1)/2;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
			
		}
		System.out.println(ex-sum);
		
	}

}
