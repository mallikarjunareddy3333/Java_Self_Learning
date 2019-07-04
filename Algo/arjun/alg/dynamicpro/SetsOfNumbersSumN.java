package arjun.alg.dynamicpro;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SetsOfNumbersSumN {

	static int count_sets(int arr[], int total) {
		return rec(arr, total, arr.length - 1);
	}

	static int rec(int arr[], int total, int n) {
		if (total == 0) {
			return 1;
		} else if (total < 0) {
			return 0;
		} else if (n < 0) {
			return 0;
		} else if (total < arr[n]) {
			return rec(arr, total, n - 1);
		} else {
			return rec(arr, total - arr[n], n - 1) + rec(arr, total, n - 1);
		}

	}

	public static void main(String[] args) {
		int numbers[] = { 2, 4, 6, 10, 2 };
		System.out.print("Array of Numbers: ");
		IntStream.of(numbers).forEach((i) -> System.out.print(i + " "));
		System.out.println("\nNumber of subsets of size 10: " + count_sets(numbers, 10));
	}

}
