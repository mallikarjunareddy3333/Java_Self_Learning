package arjun.prgms.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidIdentifiers {

	public static void main(String[] args) {
		String pattern = "[a-zA-Z][a-zA-Z0-9-#]+";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher("?arjun");
		if (m.find() && m.group().equals("?arjun")) {
			System.out.println("valid identifier");
		} else {
			System.out.println("Invalid identifier");
		}
	}

}
