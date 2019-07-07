package com.arjun.java.collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap m = new HashMap();
		m.put("chiranjeevi", 700);
		m.put("balaiah", 800);
		m.put("venkatesh", 200);
		m.put("nagarjuna", 500);
		System.out.println(m);
		System.out.println(m.put("chiranjeevi", 100));// 700

		Set s = m.keySet();
		System.out.println(s);

		Collection values = m.values();
		System.out.println(values);

		Set s1 = m.entrySet();
		System.out.println(s1);// [nagarjuna=500,venkatesh=200,balaiah=800,chiranjeevi=100]

		Iterator it = s1.iterator();
		while (it.hasNext()) {
			Map.Entry m1 = (Map.Entry) it.next();
			System.out.println(m1.getKey() + "........" + m1.getValue());
			if (m1.getKey().equals("nagarjuna")) {
				m1.setValue(1000);
			}
		}
		
		System.out.println(m);

	}

}
