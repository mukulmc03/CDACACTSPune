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
	
	//to delete an element
	public void delete(int element) {
		root = deleteElement(root, element);
	}
	
	private Node deleteElement(Node node, int element) {
		//check if tree is empty
		if (node == null) {
			System.out.println("Empty!");
			return null;
		}
		//find element in the tree (leaf node)
		if(node.data > element)
			node.leftSubTree = deleteElement(node.leftSubTree, element); //traverse
		else if(node.data < element)
			node.rightSubTree = deleteElement(node.rightSubTree, element); 
		
		else {
			//if node has only one child or no child
			if(node.leftSubTree == null) {
				System.out.println(element + " deleted successfully!");
				return node.rightSubTree;
			}
			
			else if(node.rightSubTree == null) {
				System.out.println(element + " deleted successfully!");
				return node.leftSubTree;
			}	
			//if the node has two children
			//keep inorder successor of node in the position of the element to be deleted
			node.data = inorderSuccessor(node.rightSubTree);
					
			//delete inorder successor
			node.rightSubTree = deleteElement(node.rightSubTree, node.data);
		}
		
		return node;
	}

	//to find inorder Successor
	private int inorderSuccessor(Node rightSubTree) {
		int inorderSuccessor = rightSubTree.data;
		while(rightSubTree.leftSubTree != null) {
			inorderSuccessor = rightSubTree.leftSubTree.data;
			rightSubTree = rightSubTree.leftSubTree;
		}
		return inorderSuccessor;
	}

	//to insert element in BST
	public void insert(int element) {
		root = insertElement(root, element);
		System.out.println(element + " inserted successfully!");
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
