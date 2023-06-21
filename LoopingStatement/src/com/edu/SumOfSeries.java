//write a program to find sum of series 1/2+1/4+1/6+......+1/20
package com.edu;

public class SumOfSeries {
  public static void main(String[] args) {
	//double  sum = 0.0;
	//for(int i=2;i<=20;i+=2) {
	//	sum +=1.0/i;
//	}
	//System.out.println("The sum of series is "+sum);
	
	//Optional program
	  int n=10;
	  float sum =0;
	  for(int i=1; i<=n;i++) {
		  sum = sum +((float)1/(i*2));
		  
	  }
	  System.out.println("Sum = "+sum);
	
}
}
