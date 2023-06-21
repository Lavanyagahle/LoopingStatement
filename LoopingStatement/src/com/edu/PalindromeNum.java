package com.edu;

import java.util.Scanner;

public class PalindromeNum {
public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		int temp;
	    temp = num;
		int rev = 0;
		while(num!=0) {
			int rem = num%10;
			rev = rev*10+rem;
			num = num/10;
		}
		System.out.println("The Reverse of  is "+rev);
		if(temp==rev) {
			System.out.println("Given number is palindrome");
		}else {
			System.out.println("Given number is not palindrome");
		}
	}
}

