package binarySearchTree;

public class BinarySearchTreeClass {
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
	public BinarySearchTreeClass() {
		root = null;
	}
	
	//to insert element in BST
	public void insert(int element) {
		root = insertElement(root, element);
	}
	
	//insert element in BST
	private Node insertElement(Node node, int element) {
		//if tree is empty
		if(node == null) {
			node = new Node(element);
			return node;
		}
		
		//traverse to insert - if element is smaller than root 
		if(element < node.data)
			node.leftSubTree = insertElement(node.leftSubTree, element);
		
		//traverse to insert - if element is greater than root
		else if(element > node.data)
			node.rightSubTree = insertElement(node.rightSubTree, element);
			
		return node;
	}

	//to find element in BST
	public boolean find(int element) {
		return findInBST(root, element);
	}
	
	private boolean findInBST(Node node, int element) {
		if(node == null)
			return false;
		
		if(node.data == element)
			return true;
		
		if(element < node.data) {
			if(node.leftSubTree != null)
				return findInBST(node.leftSubTree, element);
			else
				return false;
		}
		
		if(element > node.data) {
			if(node.rightSubTree != null)
				return findInBST(node.rightSubTree, element);
			return false;
		}
		
		return false;
	}

	//to print elements in BST
	public void print() {
		//if tree is empty
		if(root == null)
			System.out.println("Tree is empty!");
		inOrder(root);
	}

	private void inOrder(Node node) {
		//traverse left Subtree
		if(node != null) {
			inOrder(node.leftSubTree);
		
			//print root
			System.out.print(node.data + " - > ");
		
			//traverse right Subtree
			inOrder(node.rightSubTree);
		}
	}	
}
