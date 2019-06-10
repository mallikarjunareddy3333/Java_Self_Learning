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
	
	public void insert(int data) {
		Node newNode = new Node(data);
		System.out.println("element "+ data + " is inserted.");
		if (head == null) {
			head = newNode;
			newNode.next = head;
			return;
		}
		
		Node temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		
		newNode.next = head;
		temp.next = newNode;
	}
	
	public void display() {
		if (head == null) {
			System.out.println("List is empty.");
			return;
		}
		
		Node temp = head;
		while(temp.next != head) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.print(temp.data + "->");
		System.out.println(temp.next.data);
	}

	public static void main(String[] args) {
		CSLL list = new CSLL();
		list.display();
		list.insert(10);
		list.display();
		list.insert(20);
		list.display();
	}

}
