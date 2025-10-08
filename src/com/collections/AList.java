package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AList {
	public static void main(String[] args){
		List <Integer> list1=new ArrayList<>();
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(2);
		//returns the element which was previously present on the list
		System.out.println(list1.set(1, 100));
		System.out.println(list1);
		
		List<Integer> list2=new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(30);
		list2.add(30);
		list2.add(30);
		list2.add(30);
		list2.add(30);
		list2.add(30);
		list2.add(30);
		list2.add(30);
		list2.add(30);
		list2.add(30);
		list2.add(30);
		list2.add(30);
		list2.add(30);
		
		
		System.out.println(list2);
		list1.addAll(list2);
		System.out.println(list1);
		//returns the first occurance of the passed element
		System.out.println(list1.indexOf(2));
		//returns the last occurance of the passed element
		System.out.println(list1.lastIndexOf(2));
		//won't create a new copy just displays so modifications done to the sublist will affect the original list as well
		List<Integer> list3=list1.subList(2, 5);
		System.out.println(list3);
		list3.set(0, 1000);
		// modifies the element 4 into 1000 in the original list as well
		System.out.println(list1);
		// converting to arrays
		//make sure the size is equivalent to the size of array list or keep it lesser.
		//So it will automatically fit to the size of array list in this case it is set to 0
		//if kept a larger size it will replace every other element to null -> NullPointerException
//		Integer[] arr=list1.toArray(new Integer[0]);
//		for(int x:arr) {
//			System.out.print(x+ " ");
//		}
		
		Iterator<Integer> iterator = list2.iterator();
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
		
		System.out.println(list2.size());
//		for(int val:list2) {
//			list2.remove(val);
//		}
		
		
		
		System.out.println(list2.size()+" d;ljfd");
	

		
	}
}
