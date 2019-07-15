package com.arjun.java.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredefinedCharacterClasses {

	public static void main(String[] args) {

		String patterns[] = { "\\s", "\\d", "\\w", ".", "\\S", "\\D", "\\W" };

		for (String x : patterns) {

			Pattern p = Pattern.compile(x);
			Matcher m = p.matcher("a1b7 @z#");
			System.out.println(x);
			System.out.println("-----------");
			while (m.find()) {
				System.out.println(m.start()+"-------"+m.group());
			}
		}

	}

}
