package com.arjun.java.collections.cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);// [balakrishna, venki, chiru, nag]

		ListIterator li = l.listIterator();
		while (li.hasNext()) {
			String s = (String) li.next();
			if (s.equals("venki")) {
				//li.remove();
				//li.set("chran");
				li.add("chran");
			}
		}
		System.out.println(l);
	}

}
