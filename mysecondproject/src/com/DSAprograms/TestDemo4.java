package com.DSAprograms;
//insertion sort
import java.util.Arrays;

public class TestDemo4 {

	public static void main(String[] args) {
		int[] arr= {4,5,6,3,2,1};
		 for(int i=1;i<arr.length;i++) {
			 int temp=arr[i];
			 
			 int j=i;
			 while(j>0&&arr[j-1]>temp) {
				 arr[j]=arr[j-1];
				 j=j-1;
			 }
			 arr[j]=temp;
			 
		 }
			System.out.println(Arrays.toString(arr));

	}
}
