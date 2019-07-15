package com.arjun.java.enums;

public enum Color {

	BLUE, RED {
		public void info() {
			System.out.println("Dangerous color");
		}
	},
	GREEN;

	public void info() {
		System.out.println("Universal color");
	}

	public static void main(String[] args) {
		Color[] c = Color.values();
		for (Color c1 : c) {
			c1.info();
		}
	}

}
