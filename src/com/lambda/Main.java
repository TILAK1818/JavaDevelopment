package com.lambda;

public class Main implements FunctionalInterface {

	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("Hi this is me from a method");
	}
	
	public static void main(String[] args) {
//		FunctionalInterface obj=new Main();
//		obj.greet();
		//the above example can also be done using anonymous class even without using a separate class
//		FunctionalInterface obj=new FunctionalInterface()
//		 {
//		 	public void greet(){
//		 		System.out.println("Hi this is me from anonymous class");
//		 		}
//		 };
//		 obj.greet();
		
		//We do this because we know what is the signature of the method, return type and name s well. So the compiler will also know -> That is Lambda Expressions
		
		FunctionalInterface obj2=() -> System.out.println("Hi this is me from lambda expression");
		obj2.greet();
	}

}
