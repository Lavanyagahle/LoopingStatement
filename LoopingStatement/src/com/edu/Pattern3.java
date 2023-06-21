package com.edu;

public class Pattern3 {
public static void main(String[] args) {
	int row=4;
	int diff, value;
	int n=1;
	for(int i=1;i<=row;i++) {
		diff = row-1;
		value=i;
		for(int j=1; j<=i;j++) {
			System.out.print(value);
		    value = value+ diff;
		    diff--;
		}
		System.out.println(" ");
	}
}
}
