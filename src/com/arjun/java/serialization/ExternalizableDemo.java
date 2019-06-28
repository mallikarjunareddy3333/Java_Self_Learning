package com.arjun.java.serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class TestExternal implements Externalizable {

	String name = "Arjun";

	int i = 10;

	int j = 20;

	public TestExternal() {
		// TODO Auto-generated constructor stub
	}

	public TestExternal(String name, int i, int j) {
		this.name = name;
		this.i = i;
		this.j = j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeInt(i);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String) in.readObject();
		i = in.readInt();
	}

}

public class ExternalizableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		TestExternal t1 = new TestExternal("malli", 100, 200);
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t1);

		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		TestExternal t2 = (TestExternal) ois.readObject();
		System.out.println(t2.name + "-------" + t2.i + "--------" + t2.j);
	}

}
