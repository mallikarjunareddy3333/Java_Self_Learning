package com.arjun.java.langpkg;

public class StringDemo {

	public static void main(String[] args) {
		
		String name = new String();
		name = name.concat("Arjun");
		System.out.println(name);

		char[] chars = { 'a', 'r', 'j', 'u', 'n', 'a' };
		name = new String(chars);
		System.out.println(name);

		byte[] b = { 100, 101, 102 };
		name = new String(b);
		System.out.println(name);
		
		String s1 = new String("you can not change me");
		String s2 = new String("you can not change me");

		System.out.println(s1 == s2); // false
		System.out.println(s1.equals(s2)); // true

		String s3 = "you cannot change me!";
		System.out.println(s1 == s3); // false

		String s4 = "you cannot change me!";
		System.out.println(s3 == s4); // true

		String s5 = "you cannot " + "change me!";
		System.out.println(s3 == s5); // true

		String s6 = "you cannot ";
		String s7 = s6 + "change me!";
		System.out.println(s3 == s7); // false

		final String s8 = "you cannot ";
		String s9 = s8 + "change me!";
		System.out.println(s3 == s9);// true
		System.out.println(s6 == s8);// true
		
		String s10 = new String("you are good");
		String s11 = s10.intern();
		String s12 = new String("you are good");
		
		System.out.println(s10 == s11); //false
		System.out.println(s10 == s12); //false
		
		String s13="you are good";
		System.out.println(s11==s13);//true		
	}

}
