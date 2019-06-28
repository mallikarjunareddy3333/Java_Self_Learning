package com.arjun.java.generics;

class Gen<T> {

	T obj;

	public Gen(T obj) {
		this.obj = obj;
	}

	public void show() {
		System.out.println("The type of object is " + obj.getClass().getName());
	}

	public T getObject() {
		return this.obj;
	}
}

public class GenericsDemo {

	public static void main(String[] args) {
		
		Gen<String> g1 = new Gen<String>("Arjun");
		Gen<Integer> g2 = new Gen<Integer>(10);
		Gen<Double> g3 = new Gen<Double>(10.5);

		g1.show();
		System.out.println(g1.getObject());

		g2.show();
		System.out.println(g2.getObject());

		g3.show();
		System.out.println(g3.getObject());

	}

}
