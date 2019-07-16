package com.arjun.java.innerclasses;

public class MethodLocalInnerClass {
	int x=10;
	static int y=20;
	public void methodOne() {
		class Inner {
			public void sum(int i, int j) {
				System.out.println("The sum:" + (i+j));
			}
			
			public void method2() {
				System.out.println(x);
				System.out.println(y);
			}
			
		}
		
		Inner i = new Inner();
		i.sum(10, 20);
		i.sum(100, 200);
		i.sum(1000, 2000);
		i.method2();
	}
	
	public static void main(String[] args) {
		new MethodLocalInnerClass().methodOne();
	}

}
