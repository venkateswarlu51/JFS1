package com.DSAprograms;
//merge sort

import java.util.Arrays;

public class TestDemo3 {

	public static void main(String[] args) {
		int[] arr = {5,6,4,3 };
		division(arr);
		System.out.println("After sorting:" + Arrays.toString(arr));
	}

	private static void division(int[] arr) {
		if (arr.length == 1) {
			return;

		}
		int[] left = new int[arr.length / 2];
		int[] right = new int[arr.length - left.length];
		int i = 0;
		for (i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}
		for (int j = 0; j < right.length; j++) {
			right[j] = arr[i];
			i++;
		}
		division(left);
		System.out.println("left values:" + Arrays.toString(left));
		division(right);
		System.out.println("right values:" + Arrays.toString(right));
		merge(arr, left, right);
	}

	 static void merge(int[] arr, int[] left, int[] right) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <right[j]) {
				arr[k++] = left[i++];
			}else {
				arr[k++]=right[j++];
			}
		}
		while(i<left.length) {
			arr[k++]=left[i++];
		}
		while(j<right.length) {
			arr[k++]=right[j++];
		}
	}

}
