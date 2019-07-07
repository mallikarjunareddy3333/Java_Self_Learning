package com.arjun.java.collections.cursors;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		for (int i = 0; i <= 10; i++) {
			a.add(i);
		}
		System.out.println(a);// [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

		Iterator it = a.iterator();
		while (it.hasNext()) {
			Integer i = (Integer) it.next();
			if (i % 2 == 0)
				System.out.println(i);// 0, 2, 4, 6, 8, 10
			else
				it.remove();
		}
		System.out.println(a);
	}

}
