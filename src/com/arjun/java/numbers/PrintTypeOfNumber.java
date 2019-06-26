package com.arjun.java.numbers;

public class PrintTypeOfNumber {

	static void getTypeOfValue(String arg) {
		try {
			Integer.parseInt(arg);
			System.out.println("Integer type");
		} catch (NumberFormatException e) {
			try {
				Long.parseLong(arg);
				System.out.println("Long type");
			} catch (NumberFormatException e1) {
				try {
					Float.parseFloat(arg);
					System.out.println("Float type");
				} catch (NumberFormatException e2) {
					try {
						Double.parseDouble(arg);
						System.out.println("Double type");
					} catch (NumberFormatException e3) {
						if (arg.length() == 1) {
							System.out.println("Character type");
						} else {
							System.out.println("String type");
						}
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		String[] objs = { "1234567890.324", "6457509", "6475869283", "9475686.475858", "9223372036854775807", "arjun",
				"x" };

		for (int i = 0; i < objs.length; i++) {
			System.out.println("-------------------");
			System.out.println("given input " + objs[i].toString());
			getTypeOfValue(objs[i].toString());
		}
	}

}
