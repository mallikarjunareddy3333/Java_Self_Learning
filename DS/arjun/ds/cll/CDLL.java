package arjun.ds.cll;

public class CDLL {

	Node head, tail;

	class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			this.data = data;
		}

	}

	public void insertAtFront(int data) {
		Node newNode = new Node(data);
		System.out.println("\nelement " + data + " added to the list.");
		if (head == null) {
			head = tail = newNode;
			head.next = head;
			head.prev = tail;
			tail.next = head;
			tail.prev = head;
			return;
		}
		
		Node temp = head;
		
		newNode.next = temp;
		newNode.prev = tail;
		temp.prev = newNode;
		tail.next = newNode;
		head = newNode;
	}
	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data);
		System.out.println("\nelement " + data + " added to the list.");
		if (head == null) {
			head = tail = newNode;
			head.next = head;
			head.prev = tail;
			tail.next = head;
			tail.prev = head;
			return;
		}
		
		Node temp = tail;
		
		temp.next = newNode;
		newNode.prev = temp;
		
		newNode.next = head;
		head.prev = temp;
		
		tail = newNode;
		
	}
	
	public void deleteAtFront() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		
		if (head.next == head) {
			head = tail = null;
			return;
		}
		
		Node nextNode = head.next;
		nextNode.prev = tail;
		tail.next = nextNode;
		head = nextNode;
	}

	public void display() {
		System.out.print("List: ");
		Node temp = head;
		if (temp == null) {
			System.out.println("List is empty.");
			return;
		}		
		
		while(temp.next != head) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println(temp.data);
	}

	public static void main(String[] args) {
		CDLL list = new CDLL();
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
