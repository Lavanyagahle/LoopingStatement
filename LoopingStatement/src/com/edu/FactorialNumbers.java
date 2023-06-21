package com.edu;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialNumbers {
public static void main(String[] args) {
	int num;
	System.out.println("Enter number");
	Scanner sc= new Scanner(System.in);
	num = sc.nextInt();
	int i=1;
	long fact =1;
	
	while(i<=num) {
		fact = fact * i;
		i++;
	}
	System.out.println("Factorial of "+num+" is "+fact);
}
}
