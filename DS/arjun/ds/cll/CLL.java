package arjun.ds.cll;

public class CLL {

	public Node insertToEmpty(Node last, int data) {
		last = new Node(data);
		last.next = last;
		return last;
	}

	public Node insertAtStart(Node last, int data) {

		if (last == null) {
			last = insertToEmpty(last, data);
			return last;
		}
		
		Node newNode = new Node(data);
		Node startNode = last.next;
		
		newNode.next = startNode;
		last.next = newNode;

		return last;
	}
	
	public Node insertAtEnd(Node last, int data) {
		if (last == null) {
			last = insertToEmpty(last, data);
			return last;
		}
		
		Node newNode = new Node(data);
		
		newNode.next = last.next;
		last.next = newNode;
		
		last = newNode;
		
		return last;
	}
	
	public Node deleteAtFirst(Node last) {
		if (last == null) {
			System.out.println("List is empty.");
			return last;
		}
		
		if (last.next == last) {
			last = null;
			return null;
		}
		
		Node start = last.next;
		last.next = start.next;
		
		return last;
	}
	
	public Node deleteAtEnd(Node last) {
		if (last == null) {
			System.out.println("List is empty.");
			return last;
		}
		
		if (last.next == last) {
			last = null;
			return null;
		}
		
		Node temp = last;
		while(temp.next != last) {
			temp = temp.next;
		}
		
		temp.next = last.next;
		last = temp;
		
		return last;
	}

	public void display(Node last) {
		if (last == null) {
			System.out.println("List is empty.");
			return;
		}
		System.out.print("\nList: ");
		Node temp = last.next;
		while (temp != last) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}

		System.out.print(temp.data);
	}

	public static void main(String[] args) {
		CLL list = new CLL();
		Node last = null;
		list.display(last);
		last = list.insertAtStart(last, 40);
		list.display(last);
		last = list.insertAtStart(last, 30);
		list.display(last);
		last = list.insertAtStart(last, 20);
		list.display(last);
		last = list.insertAtEnd(last, 50);
		list.display(last);
		last = list.deleteAtFirst(last);
		list.display(last);
		last = list.deleteAtEnd(last);
		list.display(last);
	}

}
