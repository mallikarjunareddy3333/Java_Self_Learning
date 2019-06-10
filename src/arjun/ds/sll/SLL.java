package arjun.ds.sll;

public class SLL {

	private Node head;

	public void insert(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	public void insertAtEnd(int data) throws Exception {
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
	}

	public int delete() throws Exception {
		if (head != null) {
			int value = head.data;
			if (head.next != null)
				head = head.next;
			else
				head = null;
			return value;
		} else {
			throw new Exception("List is empty.");
		}
	}

	public void insertAtPos(int pos, int data) throws Exception {
		Node temp = getNthNode(pos);
		System.out.println(temp.data);
		Node newNode = new Node(data);
		Node x = temp.next;
		temp.next = newNode;
		newNode.next = x;
	}

	public void deleteAtPos(int pos) throws Exception {
		if (head == null) {
			return;
		}

		Node temp = head;

		if (pos == 0) {
			System.out.println("deleted element is " + temp.data);
			head = temp.next;
			return;
		}

		for (int i = 0; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}

		if (temp == null || temp.next == null)
			return;

		Node next = temp.next.next;
		System.out.println("deleted element is " + temp.next.data);
		temp.next = next;
	}

	public Node getNthNode(int index) throws Exception {
		int size = size();
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

	public int get(int index) {
		int size = size();
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

	public void display() {
		System.out.print("List: ");
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println("null");
	}

	public int size() {
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
		// System.out.println(list.delete() + " deleted");
		list.display();
		System.out.println("Size:" + list.size());
		// list.deleteAtPos(6);
		list.display();

		list.insertAtEnd(10);
		list.display();

		list.deleteAtPos(0);
		list.display();

		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.insertAtEnd(50);
		list.display();
		System.out.println("Size:" + list.size());
		// System.out.println(list.delete() + " deleted");
		list.display();
		list.insertAtEnd(60);
		list.display();
		System.out.println(list.get(4));

		list.insertAtPos(2, 15);
		list.display();

		list.deleteAtPos(4);
		list.display();
	}

}
