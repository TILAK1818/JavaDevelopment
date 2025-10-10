package com.lambda;

public class Demo {
	public static void main(String[] args) {
		// lambda expression
		// if we have multiple lines of code then
		A obj=(int i,int j)->{
			System.out.println("Method executing");
			return i*j;
		};
		System.out.println(obj.multiply(10, 19));
		
		
		
		A obj1 =(int i, int j)->i*j;
		System.out.println(obj1.multiply(5, 8));
				
	}
}
