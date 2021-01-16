package doublyLinkedList;

public class MyDLL {

	public class SingleNode { // make a class for the single node for doubly linked list having (next prev and
								// data)
		int data;
		SingleNode next;
		SingleNode prev;
	}

	private SingleNode head; // create a node i.e. head which is used to point he first node in list
	private SingleNode last; // first it is initialised to the null by using constructor

	public MyDLL() {
		head = null;
		last = null;
	}

	// =================== Add a number at the front of list==============

	public void addAtFront(int no) {
		SingleNode newNode = new SingleNode();
		newNode.data = no;
		newNode.prev = null;
		if (head != null) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		} else {
			last = newNode;
			head = newNode;
		}
		System.out.println("You have Added " + no + " Succussfully..!!");
	}

	// =================== Add a number at the End of list=================

	public void addAtEnd(int no) {
		if (head == null)
			addAtFront(no);
		else {
			SingleNode current = new SingleNode();
			current = head;

			while (current.next != null) {
				current = current.next;
			}
			SingleNode endNode = new SingleNode();
			endNode.data = no;
			endNode.next = null;
			endNode.prev = current;
			current.next = endNode;
			last = endNode;
			System.out.println("You have Added " + no + " Succussfully..!!");
		}
	}

	// ===================Print all elements stored in the list (by Traversing)=======================

	public void displayList() {
		SingleNode current = new SingleNode();
		current = head;
		if (head == null)
			System.out.println("Empty list..!!");
		else {
			while (current != last.next) {
				System.out.print(current.data + " --> ");
				current = current.next;
			}
			System.out.println();
		}

	}

	// ===========================SORTING WISE ADD=============================

	public void addBySorting(int no) {
		if (head == null) { // if list is empty
			SingleNode middleNode = new SingleNode();
			middleNode.data = no;
			middleNode.next = null;
			middleNode.prev = null;
			head = middleNode;
			last = middleNode;
		} else {
			SingleNode current = head;
			while ((current != null) && (current.data < no)) {
				current = current.next;
			}
			if (current == head) { // data smallest asla tr loop mhe enter ch kela nhi // ani extra pinter use nahi
									// krt ahe so hi condition // when we add smallest value
				SingleNode middleNode = new SingleNode();
				middleNode.data = no;
				middleNode.next = current;
				middleNode.prev = null;
				current.prev = middleNode;
				head = middleNode;
				System.out.println("You have Added " + no + " Succussfully..!!");
			} else if (current == null) { // when we add bigest value // add at End
				SingleNode middleNode = new SingleNode();
				middleNode.data = no;
				middleNode.next = null;
				middleNode.prev = last;
				last.next = middleNode;
				last = middleNode;
				System.out.println("You have Added " + no + " Succussfully..!!");
			} else { // add at middle
				SingleNode middleNode = new SingleNode();
				middleNode.data = no;
				middleNode.next = current;
				middleNode.prev = current.prev;
				middleNode.prev.next = middleNode;
				current.prev = middleNode;
				System.out.println("You have Added " + no + " Succussfully..!!");
			}
		}
	}

	// =============== Delete Operation (All Node having Number) ================

	public void deleteAll(int no) {
		SingleNode current = head;
		while (current != null) {			     					// we have to traverse whole link 
			if (current.data == no) {								// checking each node wheather current node data is equal to the given number
				deleleElement(current);							// if data is same then remove.. so here we are calling deletion operation many time
			}
			current = current.next;
		}
	}

	// ============== Delete Operation (Single Node having Number)===========
	
	  public void deleteSingle(int no) { 
		  SingleNode current = head ; 	
	  while(current != null && current.data != no) {      		// travel till we will get (data==no) so condition ge false and we will be out of loop
		  current = current.next; 
		  }
	  deleleElement(current); 												// perform deletion once only
	  current = current.next;
	  }
	 

	// ======

	void deleleElement(SingleNode removableNode) {
		if (head == removableNode && head == last) {       // if we have only one node then we have give null to the head
			head = null;
			last = null;
			System.out.println("you have removed"+removableNode.data+"Successfully..!!");
		} else if (head == removableNode) {						// if we have multiple nodes bt current node is 1st node then we have to cahnge ead value to the next position
			head = removableNode.next;
			System.out.println("you have removed " + removableNode.data + " Successfully..!!");
		} else if (last == removableNode) { 						// or we can use here as condition [removeNode.next == null]...... if we have to remove last node
			last = removableNode.prev;
			removableNode.prev.next = null;
			System.out.println("you have removed"+removableNode.data+"Successfully..!!");
		} else {																	// if we have to remove the node in between
			removableNode.prev.next = removableNode.next;
			removableNode.next.prev = removableNode.prev;
			System.out.println("you have removed " + removableNode.data + " Successfully..!!");
		}
	}

	
	
	
	
}

