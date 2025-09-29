package com.tilak;

import java.util.Arrays;

public class VariableArgs {

	public static void main(String[] args) {
		values(1,2,3,4,5);
	}
	
	static void values(int ...nums) {
		System.out.print(Arrays.toString(nums));
	}

}
