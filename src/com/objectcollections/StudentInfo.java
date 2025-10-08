package com.objectcollections;

public class StudentInfo implements Comparable<StudentInfo> {
	private int maths;
	private int physics;
	public int getMaths() {
		return maths;
	}
	public int getPhysics() {
		return physics;
	}
	public StudentInfo(int maths, int physics) {
		this.maths = maths;
		this.physics = physics;
	}
	@Override
	public int compareTo(StudentInfo o) {
		/* 
		 * if(this.maths > o.maths) -> return 1 (or any positive number)
		 * if(this.maths < o.maths) -> return -1 (or any negative number)
		 * if(this.maths == o.maths) -> return 0
		 * 
		 * can be written in a single line
		 * Integer.compare(o.maths, this.maths)
		 * 
		 * Small improvements I recommend (concise)

Use Integer.compare in compareTo for safety.

If you want to rank by total marks, either change compareTo or use a Comparator when creating the PriorityQueue.

If StudentInfo should represent a distinct student beyond marks, add an id field and implement equals/hashCode accordingly.

If you want the original list1 preserved and also want the top N, using new PriorityQueue<>(list1) is fine (it copies). If you will reuse the queue afterwards, keep that in mind (poll modifies it).
		 * 
		 * 
		 * 
		 * 
		 * 
		 */ 
		return o.maths - this.maths;
	}
	@Override
	public String toString() {
		return "Maths: "+maths+" "+"Physics: "+physics; 
	}
	// Need to implement a comparable strategy to do otherwise it will throw error
	//this compareTo method will be called by the priority queue so this time it won't throw the error
}
