package com.arjun.java.langpkg;

final class ImmutableStudent {

	final private int id;
	final private String name;

	public ImmutableStudent(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj instanceof ImmutableStudent) {
			ImmutableStudent s1 = (ImmutableStudent) obj;
			if (id == s1.id && name.equals(s1.name)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

	@Override
	public int hashCode() {
		int result = 0;
		int prime = 31;

		result = prime * result + id;
		result = prime * result + name.hashCode();

		return result;
	}

	@Override
	public String toString() {
		return id + "----------" + name;
	}

}

public class ImmutableClass {

	public static void main(String[] args) {
		ImmutableStudent s1 = new ImmutableStudent(1, "Arjun");
		ImmutableStudent s2 = new ImmutableStudent(1, "Arjun");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s1.equals(s2));
	}

}
