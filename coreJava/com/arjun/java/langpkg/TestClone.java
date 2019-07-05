package com.arjun.java.langpkg;

public class TestClone implements Cloneable {

	int i = 10;
	int j = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		TestClone t1 = new TestClone();
		TestClone t2 = (TestClone) t1.clone();

		t1.i = 11;
		t1.j = 22;

		System.out.println(t1.i + " " + t1.j);
		System.out.println(t2.i + " " + t2.j);
	}

}
