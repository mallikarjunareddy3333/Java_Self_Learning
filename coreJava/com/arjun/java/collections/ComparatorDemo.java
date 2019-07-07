package com.arjun.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet(new MyComparator()); // ---->(1)
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		System.out.println(t);// [20, 15, 10, 5, 0]
	}

}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer obj1, Integer obj2) {
		return obj2.compareTo(obj1);
	}

}