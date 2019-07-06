package com.arjun.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("cricket.txt", true);
		BufferedWriter bw = new BufferedWriter(fr);
		bw.write("Mallikarjuna");
		bw.newLine();
		char[] ch={'a','b','c','d'};
		bw.write(ch);
		bw.newLine();
		bw.write("software solutions");
		bw.flush();
		bw.close();
	}

}
