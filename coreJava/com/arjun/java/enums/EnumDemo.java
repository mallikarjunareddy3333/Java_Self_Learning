package com.arjun.java.enums;

public class EnumDemo {

	private enum Bear {
		KF, KO, RC, FO
	}

	public static void main(String[] args) {

		WeekEnum friday = WeekEnum.FRIDAY;

		System.out.println(WeekEnum.SUNDAY);
		System.out.println(friday);

		System.out.println(Bear.KF);

		switch (friday) {
		case SUNDAY:
			System.out.println("It is sunday..");
			break;
		case MONDAY:
			System.out.println("It is monday..");
			break;
		case FRIDAY:
			System.out.println("It is Friday..");
			break;
		default:
			System.out.println("It is not valid option");
		}

		WeekEnum[] days = WeekEnum.values();

		for (WeekEnum day : days) {
			System.out.println(day + "........" + day.getWeekDayNum());
		}

	}

}
