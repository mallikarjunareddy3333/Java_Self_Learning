package com.arjun.java.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable {
	String userName = "Arjun";
	transient String password = "kajal";

	private void writeObject(ObjectOutputStream os) throws Exception {
		os.defaultWriteObject();
		String epassword = "123" + this.password;
		os.writeObject(epassword);
	}

	private void readObject(ObjectInputStream is) throws Exception {
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		password = epwd.substring(3);
	}

}

public class CustomizedSerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Account a1=new Account();
		System.out.println(a1.userName+"........."+a1.password);
		
		FileOutputStream fos = new FileOutputStream("account.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("account.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		
		System.out.println(a2.userName+"........."+a2.password);
	}

}
