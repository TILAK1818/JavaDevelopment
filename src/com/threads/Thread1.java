package com.threads;

//There are two ways to implement thread this is the first way by extending Thread class
public class Thread1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Running from thread1"+i);
		}
	}
}
