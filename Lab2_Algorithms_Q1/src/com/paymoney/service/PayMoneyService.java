package com.paymoney.service;

public class PayMoneyService {

	public int calc_no_of_transactions(int[] arr, int targetvalue) {
		int sum = 0,no_of_transactions=0;
			for(int i=0;i<arr.length;i++) {
				sum=sum+arr[i];
				if(sum>targetvalue) {
					no_of_transactions=i+1;
					break;
				}
					
			}
			if(sum<targetvalue) {
				no_of_transactions=-1;
			}
			return no_of_transactions;
		}
		
		
		
}
