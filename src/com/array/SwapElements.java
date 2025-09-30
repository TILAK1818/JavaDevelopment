package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class SwapElements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array1=new int[5];
		for(int x=0;x<array1.length;x++) {
			array1[x]=sc.nextInt();
		}
		System.out.println("Enter the first index: ");
		int i=sc.nextInt();
		System.out.println("Enter the second index: ");
		int j=sc.nextInt();
		sc.close();
		swap(array1,i,j);
		System.out.println(Arrays.toString(array1));
	}
	static void swap(int[] arr,int index1,int index2) {
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
	}
}
