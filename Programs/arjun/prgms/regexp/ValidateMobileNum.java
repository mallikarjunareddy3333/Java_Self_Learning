package arjun.prgms.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNum {

	public static void main(String[] args) {
		
		String mobile = "9666076170";
		String patt = "[7-9][0-9]{9}";
		
		Pattern p = Pattern.compile(patt);
		Matcher m = p.matcher(mobile);
		
		if (m.find() && m.group().equals(mobile)) {
			System.out.println("Valid Modile Number..");
		} else {
			System.out.println("Invalid Modile Number..");
		}
		
	}

}
