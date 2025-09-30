package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysBasic {

	public static void main(String[] args) {
		// Two ways
		int[] arr1=new int[5];
		String[] arr3=new String[3];
		int[] arr2= {2,3,45,65,22};
		
		System.out.println(arr1[2]); // prints 0
		System.out.println(arr3[1]); // prints null
		
		// getting input
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		//printing elements in array - 3 ways
		// using for, enhanced for and toString() method
		for(int num:arr1) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		System.out.print(Arrays.toString(arr2));
		sc.close();
		
	}
}