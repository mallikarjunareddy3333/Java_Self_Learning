package arjun.prgms.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Integer nums[] = { 1, 2, 3, 5, 2, 3, 6, 76, 23, 34, 6, 2, 4, 6, 7, 35, 6, 25, 4, 5 };
		
		System.out.println("Array with duplicates:");
		Stream.of(nums).forEach((i) -> System.out.print(i + " "));
		
		Set<Integer> newList = new HashSet<>();		
		newList.addAll(Arrays.asList(nums));
		
		System.out.println("\nArray with out duplicates:");
		newList.stream().forEach((i) -> System.out.print(i + " "));
	}

}
