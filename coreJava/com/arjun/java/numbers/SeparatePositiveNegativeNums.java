package com.arjun.java.numbers;

import java.util.stream.IntStream;

public class SeparatePositiveNegativeNums {

	public static int[] rearrange(int[] arr, int n) {
		int j = 0, temp;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				if (i != j) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		
		System.out.println("SeparatePositiveNegativeNums");
		System.out.println("----------------------------");
		
		int[] numbers = { -12, 11, -13, -5, 6, -7, 5, -3, -6 };

		System.out.println("Before arrange: ");
		IntStream.of(numbers).forEach((i) -> System.out.print(i + " "));

		numbers = rearrange(numbers, numbers.length);

		System.out.println("\nAfter arrange: ");
		IntStream.of(numbers).forEach((i) -> System.out.print(i + " "));

	}

}
