package com.arjun.java.inheritance;

class Parent {

	public void display() {

	}
	
	public int getId() {
		return 10;
	}

}

class Child extends Parent {

	public void display() {

	}
	
	@Override
	public int getId() {
		return super.getId();
	}

}

public class InheritanceTest {

	public static void main(String[] args) {

	}

}
