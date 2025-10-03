package com.oops.inheritence;

public class Box {
	int h;
	int w;
	int b;
	
	Box(){
		this.h=-1;
		this.w=-1;
		this.b=-1;
	}
	
	Box(int h, int w, int b){
		this.h=h;
		this.w=w;
		this.b=b;
	}
	
	Box(int side){
		this.h=side;
		this.w=side;
		this.b=side;
	}
	// this is a copy constructor
	Box(Box old){
		this.h=old.h;
		this.w=old.w;
		this.b=old.b;
	}
	
	public void information() {
		System.out.println("The dimentions for the shape are "+h+" "+w+" "+b);
	}
}
