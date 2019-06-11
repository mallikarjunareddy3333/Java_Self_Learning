package arjun.ds.sll;

public class LinkedListTest {

	public static void printMiddle(Node head) {
		Node slow_ptr = head, fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.next != null) {
				slow_ptr = slow_ptr.next;
				fast_ptr = fast_ptr.next.next;
			}

			System.out.println("Middle element:" + slow_ptr.data);
		}

	}

	public static void printMiddle2(Node head) {
		Node mid = head;
		int count = 0;
		while (head != null) {
			if (count % 2 != 0) {
				mid = mid.next;
			}
			count++;
			head = head.next;
		}

		if (mid != null) {
			System.out.println("Middle element: " + mid.data);
		}
	}
	
	
	
	public static void main(String[] args) {
		SLL list = new SLL();
		Node head = null;
		head = list.insert(head, 10);
		head = list.insert(head, 20);
		head = list.insert(head, 30);
		head = list.insert(head, 40);
		list.display(head);
		printMiddle(head);
		printMiddle2(head);
		head = list.insert(head, 50);
		list.display(head);
		printMiddle(head);
		printMiddle2(head);
	}

}
