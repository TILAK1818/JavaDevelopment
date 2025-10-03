package com.oops.inheritence;

public class BoxWeight extends Box{
	int weight;
	
	public BoxWeight() {
		this.weight=-1;
	}
	
	public BoxWeight(int h, int w, int b, int weight) {
		super(h,w,b);
		this.weight=weight;
	}
}
