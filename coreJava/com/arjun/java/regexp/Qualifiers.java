package com.arjun.java.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qualifiers {

	public static void main(String[] args) {

		String patterns[] = { "a", "a+", "a*", "a?" };

		for (String x : patterns) {
			Pattern p = Pattern.compile(x);
			Matcher m = p.matcher("abaabaaab");
			
			System.out.println(x);
			System.out.println("-----");
			
			while (m.find()) {
				System.out.println(m.start() + "-------" + m.group());
			}
		}
	}

}
