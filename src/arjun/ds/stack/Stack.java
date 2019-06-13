package arjun.ds.stack;

/*
 * Stack is a linear data structure which follows a particular order in which the operations are performed.
 * The order may be LIFO(Last In First Out) or FILO(First In Last Out).
 */
public class Stack {

	static final int MAX_SIZE = 1000; // Maximum size of Stack

	int arr[] = new int[MAX_SIZE];
	int top;

	public Stack() {
		top = -1;
	}

	boolean isEmpty() {
		return top < 0;
	}

	boolean push(int data) {
		if (top >= MAX_SIZE) {
			System.out.println("Stack overflow..");
			return false;
		} else {
			arr[++top] = data;
			System.out.println(data + " pushed into stack");
			return true;
		}
	}

	int pop() {
		if (top < 0) {
			System.out.println("Stack underflow..");
			return 0;
		} else {
			int x = arr[top];
			top--;
			return x;
		}
	}

	public static void main(String[] args) {
		Stack obj = new Stack();
		obj.isEmpty();
		obj.pop();
		obj.push(10);
		obj.push(20);
		System.out.println(obj.pop() + " Popped from stack");
		obj.isEmpty();
	}

}
