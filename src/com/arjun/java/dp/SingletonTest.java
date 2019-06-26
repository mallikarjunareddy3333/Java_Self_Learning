package com.arjun.java.dp;

class Singleton {

	private static Singleton obj = null;

	private Singleton() {

	}

	public static Singleton getSingletonObj() {

		if (obj == null) {
			synchronized (Singleton.class) {
				if (obj == null) {
					obj = new Singleton();
				}
			}
		}

		return obj;
	}

}

public class SingletonTest {

	public static void main(String[] args) {
		Singleton obj = Singleton.getSingletonObj();
		Singleton obj1 = Singleton.getSingletonObj();
		Singleton obj2 = Singleton.getSingletonObj();
		
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}

}
