package arjun.ds.sll;

public class SLL {

	public Node insert(Node head, int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
		return head;
	}

	public Node insertAtEnd(Node head, int data) throws Exception {
		Node newNode = new Node(data);
		Node temp = head;
		if (temp == null) {
			head = newNode;
		} else if (temp.next == null) {
			temp.next = newNode;
		} else {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = null;
		}
		return head;
	}

	public Node delete(Node head) throws Exception {
		if (head != null) {
			if (head.next != null)
				head = head.next;
			else
				head = null;
			return head;
		} else {
			throw new Exception("List is empty.");
		}
	}

	public Node insertAtPos(Node head, int pos, int data) throws Exception {
		Node temp = getNthNode(head, pos);
		System.out.println(temp.data);
		Node newNode = new Node(data);
		Node x = temp.next;
		temp.next = newNode;
		newNode.next = x;
		return head;
	}

	public Node deleteAtPos(Node head, int pos) throws Exception {
		if (head == null) {
			return head;
		}

		Node temp = head;

		if (pos == 0) {
			System.out.println("deleted element is " + temp.data);
			head = temp.next;
			return head;
		}

		for (int i = 0; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}

		if (temp == null || temp.next == null)
			return head;

		Node next = temp.next.next;
		System.out.println("deleted element is " + temp.next.data);
		temp.next = next;
		
		return head;
	}

	public Node getNthNode(Node head, int index) throws Exception {
		int size = size(head);
		Node temp = head;
		if (size == 0) {
			throw new Exception("List is empty");
		} else if (size == 1 && index == 0) {
			return temp;
		} else if (index >= 1 && index < size) {
			int count = 0;
			while (index - 1 != count) {
				temp = temp.next;
				count++;
			}
			return temp;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public int get(Node head, int index) {
		int size = size(head);
		if (index >= 0 && index < size) {
			Node temp = head;
			int count = 0;
			while (index != count) {
				temp = temp.next;
				count++;
			}
			return temp.data;
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	public void display(Node head) {
		System.out.print("List: ");
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public int size(Node head) {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	public static void main(String[] args) throws Exception {
		SLL list = new SLL();
		Node head = new Node(1);
		
		// System.out.println(list.delete() + " deleted");
		list.display(head);
		System.out.println("Size:" + list.size(head));
		// list.deleteAtPos(6);
		list.display(head);

		head = list.insertAtEnd(head, 10);
		list.display(head);

		head = list.deleteAtPos(head, 0);
		list.display(head);

		head = list.insertAtEnd(head, 20);
		head = list.insertAtEnd(head, 30);
		head = list.insertAtEnd(head, 40);
		head = list.insertAtEnd(head, 50);
		list.display(head);
		System.out.println("Size:" + list.size(head));
		// System.out.println(list.delete() + " deleted");
		list.display(head);
		head = list.insertAtEnd(head, 60);
		list.display(head);
		System.out.println(list.get(head, 4));

		head = list.insertAtPos(head, 2, 15);
		list.display(head);

		head = list.deleteAtPos(head, 4);
		list.display(head);
	}

}
