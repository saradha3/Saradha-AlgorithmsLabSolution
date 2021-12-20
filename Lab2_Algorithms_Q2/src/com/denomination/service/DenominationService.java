package com.denomination.service;

public class DenominationService {
	
	public int[] sort(int[] currency, int left, int right) {
		
		if(left<right) {
			int mid=(left+right)/2;
			
			sort(currency,left,mid);
			sort(currency,mid+1,right);
			
			merge(currency,left,mid,right);
					
		}
		
		return currency;
	}
	
	public void merge(int[] currency, int left, int mid, int right) {
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		int leftArr[] =new int[n1];
		int rightArr[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			leftArr[i]= currency[left+i];
		}
		for(int j=0;j<n2;j++) {
			rightArr[j]=currency[mid+1+j];
		}
		
		int i=0,j=0,k=left;
		
		while(i<n1 && j<n2) {
			if(leftArr[i]>=rightArr[j]) {
				currency[k]=leftArr[i];
				i++;
			}
			else {
				currency[k]=rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1) {
			currency[k]=leftArr[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			currency[k]=rightArr[j];
			j++;
			k++;
		}
		
		}
	
	public void countdenominations(int[] currency, int amount) {
		int[] count = new int[currency.length];
		for(int i=0;i<currency.length;i++) {
			if(amount>=currency[i]) {
				count[i]=amount/currency[i];
				amount=amount - count[i] * currency[i];
			}
		}
		
		if(amount>0) {
			System.out.println("Amount can't be given with the provided denominations");
		}
		else {
			System.out.println("Your payment approach in order to give min no of  notes will be: ");
			for(int i=0;i<currency.length;i++) {
				if(count[i]!=0) {
					System.out.println(currency[i]+ " : " +count[i]);
				}
			}
		}
	}
		
	}


