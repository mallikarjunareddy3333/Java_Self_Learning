package arjun.ds.tree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(1); 
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
        tree.root.left.left = new Node(4); 
        tree.root.left.right = new Node(5); 
  
        System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreorder(); 
  
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 
  
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostorder(); 
		
		
		/* 4 becomes left child of 2 
		        1 
		    /       \ 
		   2          3 
		 /   \       /  \ 
		4     5   null   null 
		/      \ 
		null null 
		*/
		
	}

}
