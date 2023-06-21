//1/1!+2/2!+3/3!+....+5/5!
package com.edu;

public class SumOfFactorial {
public static void main(String[] args) {
	int n=5;
	double sum=0;
	for(int i=1;i<=n; i++) {
		int fact = 1;
		for(int j=1; j<=i; j++) {
			fact = fact*j;
		}
		sum = sum + ((double)i/fact);
	}
	System.out.println("Sum of series : "+sum);
}
}
