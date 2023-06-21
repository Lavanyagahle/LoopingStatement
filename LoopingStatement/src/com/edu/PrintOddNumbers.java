//Program for odd numbers
package com.edu;

public class PrintOddNumbers {
public static void main(String[] args) {
	//int i=1;
	//while(i<=100) {
		//if(i%2==1) {
			//System.out.println(i);
		//}
		//i++;
	//
	//}
	
	//From 100 to 1
	 //int  i=100;
	 //while(i>=1) {
		// if(i%2!=0) {
			// System.out.println(i);
		 //}
		 //i--;
	 //}
	
	
	//Sum of odd numbers from 1 to 100
	
	int i=1;
	int sum=0;
		while(i<=100) {
			if(i%2==1) {
				System.out.println(i);
				sum = sum+i;
			}
			i++;
		
		}
		System.out.println("Sum of all odd numbers from 1 to 100 is "+i);
}
}
