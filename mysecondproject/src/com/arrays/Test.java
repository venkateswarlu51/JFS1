package com.arrays;
//findout dupliacate values
public class Test {

	public static void main(String[] args) {

		        int[] arr = {1, 2, 3, 2, 4, 5, 3, 6, 2};

		        for (int i = 0; i < arr.length; i++) {

		            boolean duplicate = false;

		            for (int j = 0; j < i; j++) {
		                if (arr[i] == arr[j]) {
		                    duplicate = true;
		                    break;
		                }
		            }

		            if (duplicate) {
		                continue;
		            }

		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[i] == arr[j]) {
		                    System.out.print(arr[i] + " ");
		                    break;
		                }
		            }
		        }
		    }
		}
	

