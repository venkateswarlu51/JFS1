package com.DSAprograms;

//selection sorting
import java.util.Arrays;

public class TestDemo2 {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 4, 6, 5, 8, 9 };
		int temp = 0;
		System.out.println("befor sorting");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length - 1; i++) {
			int minindex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minindex]) {
					minindex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minindex];
			arr[minindex] = temp;
		}
		System.out.println("After sorting");
		System.out.println(Arrays.toString(arr));
	}

}
