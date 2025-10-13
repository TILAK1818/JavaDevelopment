package com.threads;

public class Main {

	public static void main(String[] args) {
		System.out.println("Main method entry");
		Thread t1=new Thread1();
		t1.start();
		System.out.println("Main method exit");
		//No order is maintained, it completely depends on JVM
		
//		Thread t2=new Thread2();
		//Passing a new Interface object
		Thread t2 =new Thread(new Thread2());
		t2.start();

	}

}
