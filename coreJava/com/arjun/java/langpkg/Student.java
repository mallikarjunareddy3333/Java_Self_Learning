package com.arjun.java.langpkg;

public class Student {

	String name;
	long rollNo;

	public Student(String name, long rollNo) {
		this.name = name;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		// return getClass().getName() + "@" + Integer.toHexString(hashCode());
		return name + "......" + rollNo;
	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;

		result = prime * result + (name != null ? name.hashCode() : 0);
		result = prime * result + (int) (rollNo ^ (rollNo >>> 32));

		return result;

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj instanceof Student) {
			Student s2 = (Student) obj;
			if (name.equals(s2.name) && rollNo == s2.rollNo) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student("saicharan", 101);
		Student s2 = new Student("ashok", 102);
		Student s3 = new Student("saicharan", 101);
		Student s4 = s1;

		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

}
