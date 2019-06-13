package arjun.ds.stack;

public class StackAsLinkedList {

	StackNode root;

	static class StackNode {
		int data;
		StackNode next;

		public StackNode(int data) {
			this.data = data;
		}

	}

	void push(int data) {

		StackNode newNode = new StackNode(data);

		if (root == null) {
			root = newNode;

		} else {
			StackNode temp = root;
			root = newNode;
			newNode.next = temp;

		}
		System.out.println(data + " pushed to stack");
	}

	int pop() {
		int popped = Integer.MIN_VALUE;
		if (root == null) {
			System.out.println("Stack is empty");
		} else {
			popped = root.data;
			root = root.next;
		}
		return popped;
	}
	
	void print() {
		StackNode temp = root;
		System.out.println("\nStack Elements: ");
		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}
	
	public static void main(String[] args) {
		StackAsLinkedList obj = new StackAsLinkedList();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		
		obj.print();
		System.out.println("\n" + obj.pop() + " is popped from stack");
		obj.print();
	}

}
