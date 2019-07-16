package com.arjun.java.innerclasses;

class Test {
	int x = 10;
	static int y = 20;

	static class Inner {
		public void methodOne() {
			System.out.println("Nested class method.");
		}
		
		public void print() {
			//System.out.println(x);
			System.out.println(y);
		}

		public static void main(String[] args) {
			System.out.println("My static nested class main method");
		}

	}

}

public class StaticNestedClass {

	public static void main(String[] args) {
		Test.Inner t = new Test.Inner();
		t.methodOne();
	}

}
