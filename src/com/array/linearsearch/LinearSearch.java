package com.array.linearsearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array1= {23,45,54,34,222,98,7};
		System.out.println(Arrays.toString(array1));
		System.out.print("Enter the target element: ");
		int target=sc.nextInt();
		if(lSearch(array1,target)) {
			System.out.println("Element is present");
		}
		else System.out.println("Element not present");
		sc.close();
	}
	
	static boolean lSearch(int[] arr, int element) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) return true;
		}
		return false;
		
	}

}
