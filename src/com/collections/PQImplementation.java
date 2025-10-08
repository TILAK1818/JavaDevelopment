package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class PQImplementation {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		pq.offer(10);
		pq.offer(20);
		pq.offer(30);
		pq.offer(40);
		pq.offer(50);
		pq.offer(60);
		System.out.println(pq);
		
//		for(int x:pq) {
//			System.out.println(x);
//		}
		
//		Iterator<Integer> iterator=pq.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		List<Integer> top2=new ArrayList<>();
		int index=0;
		while(!pq.isEmpty()) {
			if(index==2) {
				break;
			}
			top2.add(pq.poll());
			index++;
		}
		
		System.out.println(top2);
		System.out.println(pq);
	}

}
