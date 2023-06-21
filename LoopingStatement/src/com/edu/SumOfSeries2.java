package com.edu;

public class SumOfSeries2 {
public static void main(String[] args) {
	int n=10;
	float sum=0;
	for(int i=1; i<=n;i++) {
		if(i%2==0) {
			sum = sum-((float)1/(i*2));
			
		}else {
			sum = sum+((float)1/i*2);
		}
	}
	System.out.println("Sum = "+sum);
	
}
}
