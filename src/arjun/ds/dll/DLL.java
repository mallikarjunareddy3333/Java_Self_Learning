package arjun.ds.dll;

public class DLL {

	Node head;

	public void push(int data) {
		Node newNode = new Node(data);
		System.out.println("\nelement " + data + " is added to the list");

		if (head == null) {
			head = newNode;
			return;
		}

		if (head != null) {
			Node temp = head;
			newNode.next = temp;
			temp.prev = newNode;
			head = newNode;
		}
	}

	/* Given a node as prev_node, insert a new node after the given node */
	public void insertAfter(Node prev_node, int new_data) {

		if (prev_node == null) {
			System.out.println("The given previous node cannot be NULL ");
			return;
		}

		Node new_node = new Node(new_data);

		new_node.prev = prev_node;
		new_node.next = prev_node.next;
		prev_node.next = new_node;

		if (new_node.next != null) {
			new_node.next.prev = new_node;
		}

		System.out.println("\nelement " + new_data + " is added after " + prev_node.data + " to the list");

	}

	public void append(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;
			return;
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
		newNode.prev = temp;
		System.out.println("\nelement " + data + " is added to the end of the list");

	}

	/* This method will remove the first element from the list */
	public void remove() {

		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Node temp = head;

		if (head.next == null) {
			temp = null;
		} else {
			temp = temp.next;
			temp.prev = null;
		}

		System.out.println("\nelement " + head.data + " removed");

		head = temp;

	}

	public void removeAtEnd() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		
		System.out.println("\nelement " + temp.data + " removed");
		
		if (temp.prev != null)
			temp.prev.next = null;
		else
			temp = null;
		
	}

	public void remove(int value) {
		boolean found = false;
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		

		Node temp = head;
		if (temp.data == value) {
			remove();
			return;
		}

		while (temp != null) {
			if (temp.data != value) {
				temp = temp.next;
			} else {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("\nelement " + temp.data + " removed");
			if (temp.next == null) {
				temp.prev.next = null;
				return;
			}
			
			if (temp.prev == null) {
				remove();
				return;
			}
			
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
		} else {
			System.out.println("\nelement " + value + " not found");
		}

		
	}

	public void printList() {
		Node temp = head;
		Node lastNode = head;
		System.out.print("Elements forward order: ");
		if (temp == null) {
			System.out.println("List is empty.");
			return;
		}

		while (temp.next != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data + "-> null");
		lastNode = temp;

		System.out.print("Elements reverse order: ");

		while (lastNode.prev != null) {
			System.out.print(lastNode.data + " -> ");
			lastNode = lastNode.prev;
		}
		System.out.println(lastNode.data + "-> null");

	}

	public static void main(String[] args) {
		/* Start with the empty list */
		DLL list = new DLL();
		list.printList();

		list.remove();
		list.printList();

		list.push(10);
		list.printList();

		list.remove();
		list.printList();

		list.push(20);
		list.printList();

		list.remove();
		list.printList();

		list.append(40);
		list.printList();

		list.insertAfter(list.head, 30);
		list.printList();

		list.remove();
		list.printList();

		list.append(50);
		list.append(60);
		list.append(70);
		list.printList();
		
		list.removeAtEnd();
		list.printList();

		list.remove(50);
		list.printList();
		
		list.remove(70);
		list.printList();
	}

}
