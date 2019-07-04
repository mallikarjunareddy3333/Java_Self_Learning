package arjun.ds.dll;

public class DLL {
	
	public Node push(Node head, int data) {
		Node newNode = new Node(data);
		System.out.println("\nelement " + data + " is added to the list");

		if (head == null) {
			head = newNode;
			return head;
		}

		if (head != null) {
			Node temp = head;
			newNode.next = temp;
			temp.prev = newNode;
			head = newNode;
		}
		return head;
	}

	/* Given a node as prev_node, insert a new node after the given node */
	public Node insertAfter(Node head, Node prev_node, int new_data) {

		if (prev_node == null) {
			System.out.println("The given previous node cannot be NULL ");
			return head;
		}

		Node new_node = new Node(new_data);

		new_node.prev = prev_node;
		new_node.next = prev_node.next;
		prev_node.next = new_node;

		if (new_node.next != null) {
			new_node.next.prev = new_node;
		}

		System.out.println("\nelement " + new_data + " is added after " + prev_node.data + " to the list");
		return head;
	}

	public Node append(Node head, int data) {

		Node newNode = new Node(data);
		System.out.println("\nelement " + data + " is added to the end of the list");
		if (head == null) {
			head = newNode;
			return head;
		}

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = newNode;
		newNode.prev = temp;
		return head;
	}

	/* This method will remove the first element from the list */
	public Node remove(Node head) {

		if (head == null) {
			System.out.println("List is empty.");
			return head;
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
		return head;
	}

	public Node removeAtEnd(Node head) {
		if (head == null) {
			System.out.println("List is empty.");
			return head;
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
		
		return head;
		
	}

	public Node remove(Node head, int value) {
		boolean found = false;
		if (head == null) {
			System.out.println("List is empty.");
			return head;
		}
		

		Node temp = head;
		if (temp.data == value) {
			head =  remove(head);
			return head;
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
				return head;
			}
			
			if (temp.prev == null) {
				head = remove(head);
				return head;
			}
			
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
			return head;
		} else {
			System.out.println("\nelement " + value + " not found");
		}
		
		return head;
		
	}

	public void printList(Node head) {
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
		
		Node head = new Node(1);
		
		DLL list = new DLL();
		list.printList(null);

		head = list.remove(null);
		list.printList(head);

		head = list.push(head, 10);
		list.printList(head);

		head = list.remove(head);
		list.printList(head);

		head = list.push(head, 20);
		list.printList(head);

		head = list.remove(head);
		list.printList(head);

		head = list.append(head, 40);
		list.printList(head);

		head = list.insertAfter(head, head, 30);
		list.printList(head);

		head = list.remove(head);
		list.printList(head);

		head = list.append(head, 50);
		head = list.append(head, 60);
		head = list.append(head, 70);
		list.printList(head);
		
		head = list.removeAtEnd(head);
		list.printList(head);
	}

}
