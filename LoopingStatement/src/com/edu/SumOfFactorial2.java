
//1/1!-2/2!+3/3!-4/4!+5/5!
package com.edu;

public class SumOfFactorial2 {
	public static void main(String[] args) {
		int n=5;
		double sum=0;
		for(int i=1;i<=n; i++) {
			int fact = 1;
			for(int j=1; j<=i; j++) {
				fact = fact*j;
			}
			if(i%2== 0) {
			sum = sum  -((double)i/fact);
		}else {
			sum = sum + ((double)i/fact);
		}
		
	}
		System.out.println("Sum of series : "+sum);

}}
