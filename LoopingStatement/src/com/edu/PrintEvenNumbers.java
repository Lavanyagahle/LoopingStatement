//Program to print even numbers
package com.edu;

public class PrintEvenNumbers {
public static void main(String[] args) {
	//int i;
	//i =1;
	//while(i<=100) {
		//if(i%2==0) {
			//System.out.println(i);
		//}
		//i++;
	//}
	
	//even numbers from 100 to 2
	//int i=100;
	//while(i>=2) {
		//if(i%2==0) {
			//System.out.println(i);
		//}
		//i--;
	//}
	
	//For sum of all even numbers from 1 to 100
	int i;
		i =1;
		int sum=0;
		while(i<=100) {
			if(i%2==0) {
				System.out.println(i);
				sum= sum+i;
			}
			i++;
		}
		System.out.println("Sum of all even numbers from 1 to 100 is "+sum);
		
}
}
