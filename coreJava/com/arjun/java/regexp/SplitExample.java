package com.arjun.java.regexp;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class SplitExample {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("\\s");
		String[] s = p.split("arjun software solutions");

		for (String s1 : s) {
			System.out.println(s1);
		}

		p = Pattern.compile("\\.");
		s = p.split("www.arjun.com");

		for (String s1 : s) {
			System.out.println(s1);
		}

		String str = "www.arjun.com";
		s = str.split("\\.");
		for (String s1 : s) {
			System.out.println(s1);
		}

		StringTokenizer st = new StringTokenizer("sai software solutions");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		st = new StringTokenizer("1,99,988", ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
