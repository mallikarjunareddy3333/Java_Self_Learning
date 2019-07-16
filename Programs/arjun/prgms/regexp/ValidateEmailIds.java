package arjun.prgms.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateEmailIds {

	public static void main(String[] args) {
		String email = "mallikarjunareddy3333@gmail.com";
		String patt = "[a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z]+([.][a-zA-Z]+)+";

		Pattern p = Pattern.compile(patt);
		Matcher m = p.matcher(email);

		if (m.find() && m.group().equals(email)) {
			System.out.println("Valid Email ID..");
		} else {
			System.out.println("Invalid Email ID..");
		}
	}

}
