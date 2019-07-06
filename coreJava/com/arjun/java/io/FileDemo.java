package com.arjun.java.io;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("cricket.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());

		File f2 = new File("Cricket123");
		System.out.println(f2.exists());
		f2.mkdir();
		System.out.println(f2.exists());

		File f4 = new File("SaiCharan123");
		f4.mkdir();
		File f3 = new File("SaiCharan123", "abc.txt");
		f3.createNewFile();

		File f5 = new File("SaiCharan123", "abc1.txt");
		f5.createNewFile();

		int count = 0;
		
		String[] names = f4.list();
		for (String name : names) {
			File ff = new File(f4, name);
			if (ff.isFile()) {
				System.out.println(name);
			}
			count++;
		}
		System.out.println("total number: " + count);

		for (String name : names) {
			File ff = new File(f4, name);
			if (ff.isDirectory()) {
				System.out.println(name);
			}
		}
		
	}

}
