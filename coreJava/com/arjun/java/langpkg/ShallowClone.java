package com.arjun.java.langpkg;

class Cat {
	int j;

	public Cat(int j) {
		this.j = j;
	}
}

class Dog implements Cloneable {
	Cat c;
	int i;

	public Dog(Cat c, int i) {
		this.c = c;
		this.i = i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Cat c1 = new Cat(c.j);
		Dog d1 = new Dog(c1, i);
		return d1;
	}

}

public class ShallowClone {

	public static void main(String[] args) throws CloneNotSupportedException {
		Cat c1 = new Cat(20);
		Dog d1 = new Dog(c1, 10);
		System.out.println(d1.i + "......" + d1.c.j);

		Dog d2 = (Dog) d1.clone();
		d1.i = 888;
		d1.c.j = 999;
		System.out.println(d2.i + "......" + d2.c.j);
	}

}
