package com.arjun.java.innerclasses;

public class Outer {
	
	class Inner {
		/*public static void main(String[] args) {
			
		}*/
		
		public void methodone() {
			System.out.println("Inner class method");
		}
		
	}
	
	public void methodTwo() {
		Inner i = new Inner();
		i.methodone();
	}
	
	public static void main(String[] args) {
		System.out.println("outer class main method..");
		
		Outer o = new Outer();
		Outer.Inner i = o.new Inner();
		i.methodone();
		
		Outer.Inner i1 = new Outer().new Inner();
		i1.methodone();
		
		new Outer().new Inner().methodone();
		
		o.methodTwo();
	}
	
}
