package com.arjun.java.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacterClasses {

	public static void main(String[] args) {

		String patterns[] = { "[abc]", "[^abc]", "[a-z]", "[A-Z]", "[a-zA-Z]", "[0-9]", "[a-zA-Z0-9]", "[^a-zA-Z0-9]" };

		for (String x : patterns) {

			Pattern p = Pattern.compile(x);
			Matcher m = p.matcher("a1b7@z#");
			System.out.println(x);
			System.out.println("-----------");
			while (m.find()) {
				System.out.println(m.start() + "----" + m.end() + "------" + m.group());
			}
		}
	}

}
