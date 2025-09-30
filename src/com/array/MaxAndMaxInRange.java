package com.array;

import java.util.Scanner;

public class MaxAndMaxInRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array1= {12,34,2,56,89,18};
		int maximum=max(array1);
		System.out.println(maximum);
		int r1=sc.nextInt();
		int r2=sc.nextInt();
		int maximumInRange=maxInRange(array1,r1,r2);
		System.out.println(maximumInRange);
		sc.close();

	}
	static int max(int[] arr) {
		int maxx=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxx) {
				maxx=arr[i];
			}
		}
		return maxx;
	}
	
	static int maxInRange(int[] arr, int k,int l) {
		int maxx=arr[k];
		if(k > l) {
			return -1;
		}
		for(int i=k;i<l;i++) {
				if(arr[i]>maxx) {
				maxx=arr[i];
			}
		}	
		return maxx;
}
}
