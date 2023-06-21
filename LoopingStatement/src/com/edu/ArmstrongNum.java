package com.edu;

import java.util.Scanner;

public class ArmstrongNum {
public static void main(String[] args) {
	int num;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number");
	num = sc.nextInt();
	int temp;
	int arm =0;
	temp = num;
	while(num>0) {
		int rem = num%10;
		arm = (rem*rem*rem)+arm;
		num = num/10;
	}

	if(temp==arm) {
		System.out.println("Given number is armstrong number");
	}else {
		System.out.println("Given number is not armstrong number");
	}
	//System.out.println("Armstrong number is "+arm);
}
}
