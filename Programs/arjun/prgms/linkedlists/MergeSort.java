package arjun.prgms.linkedlists;

public class MergeSort {

	node head = null;

	// node a, b;
	static class node {
		int val;
		node next;

		public node(int val) {
			this.val = val;
		}
	}

	private node sortedMerge(node left, node right) {
		if (left == null) {
			return right;
		}

		if (right == null) {
			return left;
		}

		node result;

		if (left.val <= right.val) {
			result = left;
			result.next = sortedMerge(left.next, right);
		} else {
			result = right;
			result.next = sortedMerge(left, right.next);
		}

		return result;
	}

	private node mergeSort(node h) {

		if (h == null || h.next == null) {
			return h;
		}

		node middle = getMiddle(h);

		node nextofmiddle = middle.next;
		middle.next = null;

		node left = mergeSort(h);
		node right = mergeSort(nextofmiddle);

		node result = sortedMerge(left, right);

		return result;
	}

	node getMiddle(node h) {
		// Base case
		if (h == null)
			return h;
		node fastptr = h.next;
		node slowptr = h;

		// Move fastptr by two and slow ptr by one
		// Finally slowptr will point to middle node
		while (fastptr != null) {
			fastptr = fastptr.next;
			if (fastptr != null) {
				slowptr = slowptr.next;
				fastptr = fastptr.next;
			}
		}
		return slowptr;
	}

	void push(int new_data) {
		/* allocate node */
		node new_node = new node(new_data);

		/* link the old list off the new node */
		new_node.next = head;

		/* move the head to point to the new node */
		head = new_node;
	}

	// Utility function to print the linked list
	void printList(node headref) {
		while (headref != null) {
			System.out.print(headref.val + " ");
			headref = headref.next;
		}
	}

	public static void main(String[] args) {
		MergeSort li = new MergeSort();
		/*
		 * Let us create a unsorted linked list to test the functions created. The list
		 * shall be a: 2->3->20->5->10->15
		 */
		li.push(15);
		li.push(10);
		li.push(5);
		li.push(20);
		li.push(3);
		li.push(2);
		
		System.out.print("Linked List is: \n");
		li.printList(li.head);
		
		// Apply merge Sort
		li.head = li.mergeSort(li.head);
		System.out.print("\nSorted Linked List is: \n");
		li.printList(li.head);
	}

}
