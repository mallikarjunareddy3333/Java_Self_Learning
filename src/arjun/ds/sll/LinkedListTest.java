package arjun.ds.sll;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list.get(4));
		
		Deque<Integer> myList = new LinkedList<>();
		myList.addFirst(10);
		myList.addFirst(20);
		myList.addFirst(30);
		myList.addFirst(40);
		myList.addFirst(50);

		list.iterator().forEachRemaining((i) -> {
			System.out.print(i + " ");
		});

		System.out.println();

		myList.iterator().forEachRemaining((i) -> {
			System.out.print(i + " ");
		});
	}

}
