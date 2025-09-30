package com.array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] array1= new int[3][3];
		int[][] array2= {
				{1,2,3},
				{4,5,6},
				{7,8,9,10}
		};
		// getting input
		for(int row=0;row<array1.length;row++) {
			for(int col=0;col<array1[row].length;col++) {
				array1[row][col]=sc.nextInt();
			}
		}
		//printing
		// using for, enhanced for and toString
		for(int[] arr:array2) {
			System.out.println(Arrays.toString(arr));
		}
		//
		for(int row=0;row<array1.length;row++) {
			for(int col=0;col<array1[row].length;col++) {
				System.out.print(array1[row][col] + " ");
			}
			System.out.println();
		}

	}

}
