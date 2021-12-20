package com.paymoney.main;

import java.util.Scanner;

import com.paymoney.service.PayMoneyService;

public class Main {
	
	public static void main(String args[]) {
		PayMoneyService payMoneyService = new PayMoneyService();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the size of the transaction array");
		int size= sc.nextInt();
		
		int[] A = new int[size];
		System.out.println("Enter the values of the array");
		for(int i=0;i<A.length;i++) {
			A[i]= sc.nextInt();
		}
		
		System.out.println("Enter the total no of targets  that needs to be acheived");
		int targetcount = sc.nextInt();
		
		for(int i=0;i<targetcount;i++) {
			System.out.println("Enter the value of the target");
			int targetvalue = sc.nextInt();
			int no_of_transactions = payMoneyService.calc_no_of_transactions(A, targetvalue);
			if(no_of_transactions!=-1)
				System.out.println("Target acheived after "+no_of_transactions+ " transactions");
			else
				System.out.println("Given target is not acheived");
		}
		
	}

}
