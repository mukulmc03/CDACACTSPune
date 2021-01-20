package avlTree;

public class AVLTreeClass {
	public class Node{
		int data, height;
		Node leftSubTree, rightSubTree;
		
		Node(int data){
			this.data = data;
			height = 1;
		}
	}
	
	public Node root;
	
	//to find height;
	int height(Node node) {
		if(node == null)
			return 0;
		return node.height;
	}
	
	//to find balance factor
	int balanceFactor(Node node) {
		if(node == null)
			return 0;
		return height(node.leftSubTree) - height(node.rightSubTree);
	}
	
	//to find maximum of two 
	int max(int a, int b) {
		if(a > b)
			return a;
		return b;
	}
	
	//right rotate
	Node rightRotate(Node y) {
		    Node x = y.leftSubTree;
		    Node T2 = x.rightSubTree;
		    x.rightSubTree = y;
		    y.leftSubTree = T2;
		    y.height = max(height(y.leftSubTree), height(y.rightSubTree)) + 1;
		    x.height = max(height(x.leftSubTree), height(x.rightSubTree)) + 1;
		    return x;
		  }
	 
	//left rotate 
	Node leftRotate(Node x) {
		    Node y = x.rightSubTree;
		    Node T2 = y.leftSubTree;
		    y.leftSubTree = x;
		    x.rightSubTree = T2;
		    x.height = max(height(x.leftSubTree), height(x.rightSubTree)) + 1;
		    y.height = max(height(y.leftSubTree), height(y.rightSubTree)) + 1;
		    return y;
		  }
	
	 // Insert a node
	  public Node insertNode(Node node, int item) {

	    // Find the position and insert the node
	    if (node == null)
	      return (new Node(item));
	    if (item < node.data)
	      node.leftSubTree = insertNode(node.leftSubTree, item);
	    else if (item > node.data)
	      node.rightSubTree = insertNode(node.rightSubTree, item);
	    else
	      return node;

	    // Update the balance factor of each node
	    // And, balance the tree
	    node.height = 1 + max(height(node.leftSubTree), height(node.rightSubTree));
	    int balanceFactor = balanceFactor(node);
	    if (balanceFactor > 1) {
	      if (item < node.leftSubTree.data) {
	        return rightRotate(node);
	      } else if (item > node.leftSubTree.data) {
	        node.leftSubTree = leftRotate(node.leftSubTree);
	        return rightRotate(node);
	      }
	    }
	    if (balanceFactor < -1) {
	      if (item > node.rightSubTree.data) {
	        return leftRotate(node);
	      } else if (item < node.rightSubTree.data) {
	        node.rightSubTree = rightRotate(node.rightSubTree);
	        return leftRotate(node);
	      }
	    }
	    return node;
	  }

	  Node nodeWithMimumValue(Node node) {
	    Node current = node;
	    while (current.leftSubTree != null)
	      current = current.leftSubTree;
	    return current;
	  }
	  
	  // Print the tree
	  @SuppressWarnings("unused")
	  public void printTree(Node currPtr, String indent, boolean last) {
		  if (currPtr != null) {
			  System.out.print(indent);
			  if (last) {
				  System.out.print("R----");
				  indent += "   ";
			  } else {
				  System.out.print("L----");
				  indent += "|  ";
			  }
			  System.out.println(currPtr.data);
			  printTree(currPtr.leftSubTree, indent, false);
			  printTree(currPtr.rightSubTree, indent, true);
		  }
	  }
	  
	  //find element in the tree
	  public boolean find(Node node, int element) {
		  if(node == null)
			  return false;
		  
		  if(node.data == element)
			  return true;
		  
		  if(element < node.data) {
				if(node.leftSubTree != null)
					return find(node.leftSubTree, element);
				else
					return false;
			}
			
			if(element > node.data) {
				if(node.rightSubTree != null)
					return find(node.rightSubTree, element);
				return false;
			}
		  
		  return false;
	  }
}
