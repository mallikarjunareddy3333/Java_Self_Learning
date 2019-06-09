package arjun.ds.sll;

public class LinkedList {

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
		LinkedList list = new LinkedList();
		// System.out.println(list.delete() + " deleted");
		list.display();
		System.out.println("Size:" + list.size());
		list.insertAtEnd(10);
		list.insertAtEnd(20);
		list.insertAtEnd(30);
		list.insertAtEnd(40);
		list.insertAtEnd(50);
		list.display();
		System.out.println("Size:" + list.size());
		System.out.println(list.delete() + " deleted");
		list.display();
		list.insertAtEnd(60);
		list.display();
	}

}
