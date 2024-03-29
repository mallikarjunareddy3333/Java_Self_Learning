package com.arjun.java.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("cricket.txt");
		PrintWriter out = new PrintWriter(fw);
		out.write(100);
		out.println(100 +"");
		out.println(true);
		out.println('c');
		out.println("SaiCharan");
		out.flush();
		out.close();
		
		BufferedReader br = new BufferedReader(new FileReader("cricket.txt"));
		String data = br.readLine();
		while(data != null) {
			System.out.println(data);
			data = br.readLine();
		}
		br.close();
	}

}
