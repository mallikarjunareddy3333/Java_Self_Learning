package com.arjun.java.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("cricket.txt", true);
		fw.write(99);
		fw.write("haran\nsoftware solutions");
		fw.write("\n");
		char[] ch = {'a','e','i','o','u'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();
	}

}
