package com.arjun.java.inheritance;

class A {
}

class B extends A {
}

class Base {
	A fun() {
		System.out.println("Base fun()");
		return new A();
	}

	Object fun2() {
		System.out.println("Base fun2()");
		return new String("Object calss");
	}
	
	Number fun3() {
		System.out.println("Base fun3");
		return new Integer(10);
	}
}

class Derived extends Base {
	B fun() {
		System.out.println("Derived fun()");
		return new B();
	}

	@Override
	String fun2() {
		System.out.println("Derived fun2()");
		return new String("String class");
	}
	
	@Override
	Integer fun3() {
		System.out.println("Derived fun3()");
		return 10;
	}
}

public class CovarientReturnType {

	public static void main(String[] args) {
		Derived derived = new Derived();
		derived.fun();
		derived.fun2();
		derived.fun3();
	}

}
