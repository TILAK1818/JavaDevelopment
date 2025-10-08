package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Queue implementation -> LinkedList is preferred generally
		Queue <Integer> queue=new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.offer(40);
		System.out.println(queue);
		System.out.println(queue.peek());
		//removes the element from front FIFO
		queue.poll();
		System.out.println(queue.peek());
		System.out.println(queue.isEmpty());
		
		//Stack implementation -> use stack class
		Stack <Integer> stack=new Stack<>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		//[100, 200, 300]
		System.out.println(stack);
		System.out.println("Stack implementation");
		// pops out the recently inserted element -> LIFO
		System.out.println(stack.pop());
		//[100, 200]
		System.out.println(stack);
		
		//Deque implementation -> can be used for stacks and queue but not preferred
		Deque<Integer> dq=new ArrayDeque<>();
		System.out.println("Deque implementation");
		dq.offerFirst(11);
		dq.offerFirst(22);
		dq.offerLast(33);
		System.out.println(dq);
		System.out.println(dq.peekLast());
		System.out.println(dq.peekFirst());
		dq.pollFirst();
		System.out.println(dq);
		dq.pollLast();
		System.out.println(dq);

		
		

		

	}

}
