package arjun.prgms.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Integer[] a = { 1, 2, 3, 4, 5 };
		Integer[] b = { 6, 7, 8, 9, 10 };
		mergeArrays1(a, b);
		mergeArrays(a, b);

		Object[] c = Stream.of(a, b).flatMap(Stream::of).toArray();
		System.out.println(Arrays.toString(c));
	}

	public static void mergeArrays1(Integer[] a, Integer[] b) {
		Integer[] c = new Integer[a.length + b.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			c[count++] = a[i];
		}

		for (int i = 0; i < b.length; i++) {
			c[count++] = b[i];
		}

		System.out.println(Arrays.toString(c));
	}

	private static void mergeArrays(Integer[] a, Integer[] b) {
		ArrayList<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(a));
		list.addAll(Arrays.asList(b));
		Object[] c = list.toArray();
		System.out.println(Arrays.toString(c));
	}

}
