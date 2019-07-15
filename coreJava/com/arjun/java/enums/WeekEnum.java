package com.arjun.java.enums;

public enum WeekEnum {

	SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESSDAY(4), THURSDAY(5), FRIDAY(5), SATURDAY(6);

	int num;

	private WeekEnum(int num) {
		this.num = num;
	}

	public int getWeekDayNum() {
		return num;
	}

	private WeekEnum() {
		System.out.println("Enum Constructor..");
	}

	public static void main(String[] args) {
		System.out.println("Enum main method called..");
	}

}
