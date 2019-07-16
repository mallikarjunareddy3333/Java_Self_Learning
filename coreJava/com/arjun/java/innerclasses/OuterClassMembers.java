package com.arjun.java.innerclasses;

public class OuterClassMembers {
	
	int x = 10;
	static int y = 20;
	
	class Inner {
		
		int x = 100;
		
		public void methodTwo() {
			System.out.println(x);
			System.out.println(y);
			System.out.println(this.x);
			System.out.println(OuterClassMembers.this.x);
		}
	}
	
	public static void main(String[] args) {
		new OuterClassMembers().new Inner().methodTwo();
	}

}
