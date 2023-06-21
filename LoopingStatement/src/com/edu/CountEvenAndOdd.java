//Program to count even and odd number in a given number
package com.edu;

import java.util.Scanner;

public class CountEvenAndOdd {
public static void main(String[] args) {
	int num;
	System.out.println("Enter number");
	Scanner sc= new Scanner(System.in);
	num = sc.nextInt();
	int digit;
	int evenCount =0;
	int oddCount = 0;
	while(num>0) {
		digit = num%10;
		if(digit %2 ==0) {
			evenCount++;
		}else {
			oddCount++;
		}
		num = num/10;
	}
	System.out.println("Number of even digits "+evenCount);
	System.out.println("Number of odd digits "+oddCount);
}
}
