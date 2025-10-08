package com.objectcollections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PQCustomCollection {
	public static void main(String[] args) {
		List<StudentInfo> list1=new ArrayList<>();
		list1.add(new StudentInfo(88,79));
		list1.add(new StudentInfo(99,87));
		list1.add(new StudentInfo(78,93));
		list1.add(new StudentInfo(78,88));
		list1.add(new StudentInfo(81,69));
		PriorityQueue<StudentInfo> pqCustom=new PriorityQueue<>(list1);
		
		List<StudentInfo> top3=new ArrayList<>();
		int index=0;
		while(!pqCustom.isEmpty()) {
			if(index==3) {
				break;
			}
			top3.add(pqCustom.poll());
			index++;
		}
		
		System.out.println(top3);
		// Now the top 3 students with the highest maths mark will be printed because the queue is set based on prioritizing the maths marks
	}
	
	// Need to implement a comparable strategy to do otherwise it will throw error
	// One way is to implement Comparable interface in the class of which type we are implementing priority queue
}

