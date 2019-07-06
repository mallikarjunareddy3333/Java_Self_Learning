package com.arjun.java.langpkg;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());
		sb.append("q");
		System.out.println(sb.capacity());
		
		StringBuffer sb1 = new StringBuffer(19);
		System.out.println(sb1.capacity());
		
		StringBuffer sb2 = new StringBuffer("Malli");
		System.out.println(sb2.capacity());
		
		System.out.println(sb2.charAt(2));
		System.out.println(sb2.insert(2, "hello"));
		
		sb2.delete(2, 7);
		System.out.println(sb2);
		
		sb2.deleteCharAt(4);
		System.out.println(sb2);
		
		System.out.println(sb2.reverse());
		sb2.setLength(3);
		System.out.println(sb2);
	}

}
