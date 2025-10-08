package com.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListBasics {
	public static void main(String[] args) {
		List<Integer> lkList1=new LinkedList<>();
		lkList1.add(2);
		lkList1.add(3);
		lkList1.add(4);
		//[2,3,4]
		ListIterator<Integer> listIterator=lkList1.listIterator();
		System.out.println(listIterator.next());
		System.out.println(listIterator.previous());
		
	}
}
