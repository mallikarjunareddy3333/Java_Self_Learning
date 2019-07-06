package com.arjun.java.langpkg;

public class WrapperClassDemo {

	public static void main(String[] args) {
		Integer i = new Integer("10");
		System.out.println(i);
		
		i = Integer.valueOf("20");
		System.out.println(i);
		
		System.out.println(Integer.toString(i, 2));
		System.out.println(Integer.toBinaryString(i));
	}

}
