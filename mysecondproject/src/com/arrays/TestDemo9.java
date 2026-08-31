package com.arrays;

public class TestDemo9 {

	public static void main(String[] args) {
		int[] arr = { 1, 7, 5, 3, 2, 4 };
		int profit = 0;
		int miniprice=arr[0];
		int buy = 0;
		int sell = 0;
		int maxprofit = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<miniprice) {
				miniprice=arr[i];
			}
			 profit=arr[i]-miniprice;
		
		if(profit>maxprofit) {
			maxprofit=profit;
			buy=miniprice;
			sell=arr[i];
		}
			
		}
		System.out.println(maxprofit);
		System.out.println(buy);
		System.out.println(sell);

	}

}
