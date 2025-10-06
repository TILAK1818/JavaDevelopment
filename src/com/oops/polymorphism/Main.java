package com.oops.polymorphism;

public class Main {
	public static void main(String[] args) {

		ChildClass obj=new ChildClass();
		obj.greet();
		BaseClass obj2=new ChildClass();
		obj2.greet();
		BaseClass obj3=new BaseClass();
		obj3.greet();
		
		//child class object can be referred as a parent class object but parent class object cannot be referred as child
		
		example(obj);
		example(obj2);
		example(obj3);
		example1(obj);
		//example1(obj2);
		//example1(obj3);
		
		
	}
	
	private static void example(BaseClass obj) {
		obj.greet();
	}
	
	private static void example1(ChildClass obj) {
		obj.greet();
	}
}
