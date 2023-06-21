package com.edu;

public class ContinuePrintOdd {
public static void main(String[] args) {
	//For print odd number
	for(int i=1;i<=100;i++) {
		if(i%2==0) {
			continue;
		}else {
			System.out.println(i);
		}
	}
	System.out.println("Outside Loop");
	
	//For print even number
	for(int i=1;i<=100;i++) {
		if(i%2==1) {
			continue;
		}else {
			System.out.println(i);
		}
	}
	System.out.println("Outside Loop");

}
}
