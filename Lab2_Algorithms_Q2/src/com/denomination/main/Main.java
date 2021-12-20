package com.denomination.main;

import java.util.Scanner;

import com.denomination.service.DenominationService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DenominationService denominationService = new DenominationService();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations");
		int size= sc.nextInt();
		
		int[] currencyarr = new int[size];
		
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<currencyarr.length;i++) {
			currencyarr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		currencyarr = denominationService.sort(currencyarr,0,currencyarr.length-1);
		
		denominationService.countdenominations(currencyarr,amount);
		
		
		

	}

}
