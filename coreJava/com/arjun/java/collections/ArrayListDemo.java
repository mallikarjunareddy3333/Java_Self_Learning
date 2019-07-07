package com.arjun.java.collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class ArrayListDemo {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add("A");
		a.add(10);
		a.add("A");
		a.add(null);
		a.add(null);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		a.add(2, "m");
		a.add("n");
		System.out.println(a);
		
		LinkedList ll = new LinkedList();
		
		System.out.println(a instanceof Serializable);
		System.out.println(a instanceof Cloneable);
		
		System.out.println(ll instanceof Serializable);
		System.out.println(ll instanceof Cloneable);
		
		System.out.println(a instanceof RandomAccess);
		System.out.println(ll instanceof RandomAccess);
	}

}
