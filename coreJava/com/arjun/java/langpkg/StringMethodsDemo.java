package com.arjun.java.langpkg;

import java.util.HashMap;

public class StringMethodsDemo {
	
	public static void main(String[] args) {

		String s = new String("Mallikarjun");
		
		System.out.println(s.charAt(2)); //l
		//System.out.println(s.charAt(100)); // RE : StringIndexOutOfBoundsException
		
		HashMap<StringBuffer, String> names = new HashMap<>();
		names.put(new StringBuffer("abc"), "malli");
		names.put(new StringBuffer("abc"), "malli");
		names.put(new StringBuffer("abc"), "malli");
		
		System.out.println(names.size());
		
		HashMap<String, String> names1 = new HashMap<>();
		names1.put("abc", "malli");
		names1.put("abc", "malli");
		names1.put("abc", "malli");
		
		System.out.println(names1.size());
		
	}
	
}
