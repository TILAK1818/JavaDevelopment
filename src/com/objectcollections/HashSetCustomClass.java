package com.objectcollections;

import java.util.HashSet;
import java.util.Set;

public class HashSetCustomClass {

	public static void main(String[] args) {
		Set<StudentInfo> set1=new HashSet<>();
		set1.add(new StudentInfo(98,93));
		set1.add(new StudentInfo(84,77));
		set1.add(new StudentInfo(81,90));
		set1.add(new StudentInfo(100,96));
		
		System.out.println(set1);
		// false -> because the hash code generated will be different for every elements
		// In order to identify this as same object override the hashcode() and equals() method
		System.out.print(set1.contains(new StudentInfo(100,96)));
		
		// after overriding it prints true so it does not add to the set as well
		
		

	}

}
