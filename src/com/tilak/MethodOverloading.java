package com.tilak;

public class MethodOverloading {
	public static void main(String[] args) {
		prints(34,45);
		prints("Tilak","java");
	}
	
	 static void prints(String name1, String name2) {
		System.out.println(name1 + name2);
		
	}

	static void prints(int a,int b) {
		System.out.println(a + b);
	}
}
