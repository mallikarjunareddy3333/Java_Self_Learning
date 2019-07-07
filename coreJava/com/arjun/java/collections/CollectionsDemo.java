package com.arjun.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("A");
		l.add("K");
		l.add("N");
		//l.add(new Integer(10));//ClassCastException
		//l.add(null);//NullPointerException
		System.out.println("Before sorting :"+l);//[Z, A, K, N]
		Collections.sort(l);
		System.out.println("After sorting :"+l);//[A, K, N, Z]
		
		Collections.sort(l,new MyComparator2());
		System.out.println("After sorting :"+l);//[Z, L, K, A, 10]
	}

}

class MyComparator2 implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		String s1=(String)obj1;
		String s2=obj2.toString();
		return s2.compareTo(s1);
	}
}
