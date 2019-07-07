package com.arjun.java.collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		Properties p=new Properties();
		File f = new File("abc.properties");
		f.createNewFile();
		FileInputStream fis=new FileInputStream(f);
		
		p.load(fis);
		System.out.println(p);//{user=scott, password=tiger, venki=8888}
		
		String s=p.getProperty("venki");
		System.out.println(s);//8888
		p.setProperty("nag","9999999");
		
		Enumeration e = p.propertyNames();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
		FileOutputStream fos=new FileOutputStream("abc.properties");
		p.store(fos,"updated by ashok for scjp demo class");
		
		System.out.println(p);
		
	}

}
