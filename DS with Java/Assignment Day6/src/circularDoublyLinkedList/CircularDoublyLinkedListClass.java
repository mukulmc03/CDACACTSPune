package circularDoublyLinkedList;
public class CircularDoublyLinkedListClass implements CircularDoublyLinkedListInterface {
	
	public class ListNode{
		ListNode previous, next;
		int data;	
	}
	
	private ListNode head = new ListNode();
	
	public CircularDoublyLinkedListClass() {
		head.previous = head;
		head.next = head;
	}
	
	@Override
	public void printList() {
		if(head.next != head) {
			ListNode current = head.next;
			while(current != head) {
				System.out.print(" <- " + current.data + " -> ");
				current = current.next;
			}
			System.out.println();
		}
		else {
			System.out.println("List is empty!");
		}
		
	}
	
	//to insert num in sorted manner
	@Override
	public void insert(int num) {
		//initialize current to contain 1st node
		ListNode current = head.next;
		//node to be added
		ListNode newNode = new ListNode();
		//moving forward until newNode(num) is found in list
		while(current != head && current.data < num) {
			current = current.next;
		}
		
		//store data 
		newNode.data = num;
		//newNode's next part will contain current node - as we are adding newNode before current node
		newNode.next = current;
		//newNode's previous will contain contains's previous
		newNode.previous = current.previous;
		//current's previous node's next part will point to newNode
		current.previous.next = newNode;
		//current's previous node will point to newNode
		current.previous = newNode;	
		
		System.out.println(num + " added to the list!");
	}

	@Override
	public void delete(int num) {
		if(head.next != head) {
			ListNode current = head.next;
			while(current.data != num) {
				current = current.next;
			}
			current.previous.next = current.next;
			current.next.previous = current.previous;
			System.out.println(current.data + " removed from the list!");
		}
		else {
			System.out.println("List is empty!");
		}
		
	}

}
