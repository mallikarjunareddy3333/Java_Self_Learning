package arjun.prgms.regexp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OutputValidMobileNumbers {

	public static void main(String[] args) throws IOException {
		PrintWriter pw = new PrintWriter("output.txt");
		BufferedReader br = new BufferedReader(new FileReader("input.txt"));
		String mobile = br.readLine();
		
		String patt = "(0|91)?[7-9][0-9]{9}";
		Pattern p = Pattern.compile(patt);
		
		while(mobile != null) {
			Matcher m = p.matcher(mobile);
			if (m.find() && m.group().equals(mobile)) {
				pw.println(mobile);
			}
			mobile = br.readLine();
		}
		
		pw.close();
		br.close();
	}

}
