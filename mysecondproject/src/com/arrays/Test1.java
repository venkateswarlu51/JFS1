package com.arrays;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		int[] arr= {1,2,0,0,3,0,4};
		int index=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[index];
				arr[index]=arr[i];
				arr[i]=temp;
				index++;
		
			}
				
			}
		System.out.println(Arrays.toString(arr));
		
		

		}
	}

	
			
			
	
