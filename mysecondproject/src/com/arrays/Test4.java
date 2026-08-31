package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
				int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
				Scanner sc = new Scanner(System.in);
				System.out.println("enter hpoe mant times ratotionss");
				int r = sc.nextInt();
				divied(arr, r);
				System.out.println(Arrays.toString(arr));
			}

			static void divied(int[] arr, int r) {
				int start=0;
				int end=arr.length-1;
				reverse(arr,start,r-1);
				reverse(arr,r,end);
				reverse(arr,start,end);

			}

			private static void reverse(int[] arr, int start, int end) {
				while(start<end) {
					int temp = arr[start];
					arr[start]=arr[end];
					arr[end]=temp;
					start++;
					end--;
				}
			}

		

	}


