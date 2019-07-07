package com.arjun.java.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("Mallikarjun");
		ll.add(11);
		ll.add(null);
		ll.add(null);
		ll.add(11);
		System.out.println(ll);
		ll.set(2, 12);
		ll.set(0,"venky");
		System.out.println(ll);
		ll.removeLast();
		ll.addFirst("arjun");
		System.out.println(ll);
	}

}
