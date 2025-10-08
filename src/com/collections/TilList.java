package com.collections;

import java.util.Iterator;

public class TilList <T> implements Iterable<T>{
	private T[] list;
	private int size;
	
	public TilList() {
		size=0;
		//Java doesn’t allow direct creation of a generic array, so you create an Object[] and cast it to T[].
		list= (T[])new Object[100];
	}
	
	public void add(T item) {
		list[size ++]=item;
	}
	public T getItemAtIndex(int index) {
		return list[index];
	}

	@Override
	public Iterator<T> iterator() {
		
		return new GenericTilList(this);
	}
	

	private class GenericTilList implements Iterator<T>{
		
		private TilList<T> list1;
		private int index=0;
		
		public GenericTilList(TilList<T> list) {
			this.list1=list;
		}
		

		@Override
		public boolean hasNext() {
			return index < list1.size;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			//int a=list1.list[index];
			//index++;
			// return a;
			return list1.list[index++];
		}
		
	}
}
