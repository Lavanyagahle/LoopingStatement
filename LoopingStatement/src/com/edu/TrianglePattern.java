/*
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 */
package com.edu;

public class TrianglePattern {
public static void main(String[] args) {
	//int number=1;
	//int count=1;
	//for(int i=1; i<=4;i++) {
		//for(int j=1;j<=count;j++) {
			//System.out.print(number+ " ");
			//number++;
		//}
		//System.out.println();
		//count ++;
	//}
	int k=1;
	for(int i=1;i<=4;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(k+" ");
			k++;
		}
		System.out.println();
	}
}
}
