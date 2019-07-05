package arjun.ds.tree;

public class BinaryTree {

	Node root;

	public BinaryTree(int item) {
		root = new Node(item);
	}

	BinaryTree() {
		root = null;
	}

	void printPostorder(Node node) {

		if (node == null) {
			return;
		}

		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.key + " ");

	}

	void printPreorder(Node node) {

		if (node == null) {
			return;
		}

		System.out.print(node.key + " ");
		printPostorder(node.left);
		printPostorder(node.right);

	}

	void printInorder(Node node) {

		if (node == null) {
			return;
		}

		printPostorder(node.left);
		System.out.print(node.key + " ");
		printPostorder(node.right);

	}

	// Wrappers over above recursive functions
	void printPostorder() {
		printPostorder(root);
	}

	void printInorder() {
		printInorder(root);
	}

	void printPreorder() {
		printPreorder(root);
	}
}
