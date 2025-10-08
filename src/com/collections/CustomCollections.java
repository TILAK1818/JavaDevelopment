package com.collections;

import java.util.Iterator;

public class CustomCollections {
	public static void main(String[] args) {
		TilList <Integer> list=new TilList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
//		Iterator<Integer> iterator=list.iterator();
//		
////		while(iterator.hasNext()) {
////			System.out.println(iterator.next());
////		}
//		//both are same because in the backend of fopr each loop same hasnext and next is executed
		for(int x:list) {
			System.out.println(x);
		}
	}
	
}
