package com.arjun.java.innerclasses;

public class NestedInnerClass {
	
	class B {
		class C {
			public void methodOne() {
				System.out.println("Inner most method..");
			}
		}
	}
	
	public static void main(String[] args) {
		NestedInnerClass a = new NestedInnerClass();
		NestedInnerClass.B b = a.new B();
		NestedInnerClass.B.C c = b.new C();
		c.methodOne();
	}

}
