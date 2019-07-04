package arjun.ds.cll;

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
	
	public void deleteAtFront() {
		if (head == null) {
			System.out.println("List is empty.");
			return;			
		}
		
		System.out.println("element "+ head.data+ " removed");
		
		if (head.next == head) {
			head = tail = null;
			return;
		}
		
		tail.next = head.next;
		head = head.next;
	}
	
	public void deleteAtEnd() {
		if (head == null) {
			System.out.println("List is empty.");
			return;			
		}
		
		System.out.println("element "+ tail.data+ " removed");
		
		if (head.next == head) {
			head = tail = null;
			return;
		}
		
		Node temp = head;
		while(temp.next != tail) {
			temp = temp.next;
		}
		
		temp.next = tail.next;
		tail = temp;
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
		list.deleteAtFront();
		list.display();
		list.insertAtEnd(20);
		list.display();
		list.insertAtEnd(30);
		list.display();
		list.insertAtFront(5);
		list.display();
		list.deleteAtEnd();
		list.display();
		list.deleteAtEnd();
		list.display();
		list.deleteAtEnd();
		list.display();
	}

}
