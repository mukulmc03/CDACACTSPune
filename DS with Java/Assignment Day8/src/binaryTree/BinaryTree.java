package binaryTree;

public class BinaryTree {
	public class Node{
		int data;
		Node leftSubTree;
		Node rightSubTree;
		
		public Node(int value) {
			data = value;
			leftSubTree = rightSubTree = null;
		}
	}
	
	private Node root;
	public BinaryTree() {
		root = null;
	}
	
	//to create tree
	public void createTree() {
		root = new Node(20);
		root.leftSubTree = new Node(10);
		root.rightSubTree = new Node(5);
		root.leftSubTree.leftSubTree = new Node(4);
		root.leftSubTree.rightSubTree = new Node(3);
		root.rightSubTree.leftSubTree = new Node(2);
		root.rightSubTree.rightSubTree = new Node(1);
	}
	
	private void preOrder(Node node) {
		//if tree is empty
		if(node == null)
			return;
		
		//print root data
		System.out.print(node.data + " -> ");
		
		//traverse left sub tree
		if(node.leftSubTree != null)
			preOrder(node.leftSubTree);
		
		//traverse right sub tree
		if(node.rightSubTree != null)
			preOrder(node.rightSubTree);
	}
	
	//methdo overloaded
	public void preOrder() {
		preOrder(root);
	}
	
	private void postOrder(Node node) {
		//if tree is empty
		if(node == null)
			return;
		
		//traverse left subtree
		if(node.leftSubTree != null)
			postOrder(node.leftSubTree);
		
		//traverse right subtree
		if(node.rightSubTree != null)
			postOrder(node.rightSubTree);
		
		//print root data
		System.out.print(node.data + " - >");
	}
	
	//method overloaded
	public void postOrder() {
		postOrder(root);
	}
}
