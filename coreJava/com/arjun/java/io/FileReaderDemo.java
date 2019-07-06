package com.arjun.java.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("cricket.txt");
		int i = fr.read();
		while (i != -1) {
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
		
		File f = new File("cricket.txt");
		FileReader fr1 = new FileReader(f);
		char[] ch = new char[(int) f.length()];
		fr1.read(ch);
		for (char c: ch) {
			System.out.print(c);
		}
		fr1.close();
	}

}
