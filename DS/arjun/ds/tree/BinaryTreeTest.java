package arjun.ds.tree;

public class BinaryTreeTest {

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		
		tree.root = new Node(1);
		
		/* following is the tree after above statement 
		  
	        1 
	      /   \ 
	    null  null     */	
		
		
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		
		/* 2 and 3 become left and right children of 1 
		        1 
		      /   \ 
		     2      3 
		   /    \    /  \ 
		 null null null null  */

		
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		
		/* 4 becomes left child of 2 
		        1 
		    /       \ 
		   2          3 
		 /   \       /  \ 
		4     5 	6  	 7 
		/      \ 
		null null 
		*/
	}

}
