package com.arjun.java.inheritance;

import java.io.FileNotFoundException;
import java.io.IOException;

class Base1 {
	void fun() throws IOException {
		
	}
}

class Derived1 extends Base1 {
	@Override
	void fun() throws FileNotFoundException {
		
	}
}

public class ExceptionInOverrideing {

	public static void main(String[] args) {
		
	}

}
