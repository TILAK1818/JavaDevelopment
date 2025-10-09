package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetHashSet {
	public static void main(String[] args) {
		Set <Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		
		//will be unordered, because hash set cannot be sorted or ordered
		System.out.println(set1);
		//To maintain the insertion order use LinkedHashSet
		
		List<Integer> list1=new ArrayList<>();
		list1.add(20);
		list1.add(100);
		list1.add(20);
		System.out.println(list1);
		//[20, 100,20]
		//List can be passed as a parameter in Set
		//Hash set doesn't allow duplicates
		Set<Integer> set3=new HashSet<>(list1);
		System.out.println(set3);
		//[20,100]
		
		//It used LinkedList behind the scenes to maintain insertion order
		Set<Integer> set4=new LinkedHashSet<>();
		set4.add(100);
		set4.add(200);
		set4.add(100);
		set4.add(300);
		
		//maintains the insertion order
		System.out.println(set4);
		
		//Other methods
		//union
		set4.addAll(set1);
		System.out.println(set4);
		
		//Intersection
//		set4.retainAll(set1);
//		System.out.println(set4);
		
		//set difference
		set4.removeAll(set1);
		System.out.println(set4);

		

		
		
	}
}
