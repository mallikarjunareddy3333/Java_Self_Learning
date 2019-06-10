package arjun.ds.cll;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}
}

public class CSLL {

	Node head;
	Node tail;

	public void insertAtFront(int data) {
		Node newNode = new Node(data);
		System.out.println("element " + data + " is inserted.");
		if (head == null) {
			head = tail = newNode;
			tail.next = head;
			return;
		}
		
		newNode.next = head;
		tail.next = newNode;
		head = newNode;
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		System.out.println("element " + data + " is inserted.");
		if (head == null) {
			head = tail = newNode;
			newNode.next = head;
			return;
		}
		
		tail.next = newNode;
		newNode.next = head;		
		tail = newNode;
	}

	public void display() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}

		Node temp = head;
		while (temp.next != head) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public static void main(String[] args) {
		CSLL list = new CSLL();
		list.display();
		list.insertAtEnd(10);
		list.display();
		list.insertAtEnd(20);
		list.display();
		list.insertAtEnd(30);
		list.display();
		list.insertAtFront(5);
		list.display();
	}

}
