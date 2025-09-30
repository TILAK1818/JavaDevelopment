package com.array;

import java.util.Arrays;

public class ObjectArrays {
	public static void main(String[] args) {
		String[] str=new String[4];
		str[0]="aa";
		str[1]="bb";
		str[2]="cc";
		str[3]="dd";
		System.out.println(Arrays.toString(str));
		change(str);
		//arrays are mutable in java 
		System.out.println(Arrays.toString(str));
		
		
	}
	static void change(String[] arr) {
		arr[2]="tilak";
	}
}
