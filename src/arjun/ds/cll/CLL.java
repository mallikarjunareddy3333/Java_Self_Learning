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

	public void display(Node last) {
		if (last == null) {
			System.out.println("List is empty.");
			return;
		}
		System.out.print("\nList: ");
		Node temp = last.next;
		while (temp.next != last) {
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
	}

}
