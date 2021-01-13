package doublyLinkedList;

public class DoublyLinkedListClass implements DoublyLinkedList {
	//Represent the head and tail of the doubly linked list 
	private ListNode head = null;

	@Override
	public void addAtFront(int num) {
		//create a new node in listnode
		ListNode temp = new ListNode(num);
		
			//temp's previous will point to null
			temp.setPrevious(null);
			
			//check if 1st node is present
			if(head != null) {
				//temp's next will point to head
				temp.setNext(head);
			}
			else {
				//temp's next will be null - because temp will be added as 1st node
				temp.setNext(null);
			}
			
			//store data in temp node
			temp.setData(num);
			
			//head will point to temp 
			head = temp;
			
		System.out.println(num + " added successfully!");	
	}

	@Override
	public void addAtEnd(int num) {
		ListNode temp = new ListNode(num);
		ListNode current = head;
		
		//check if list is empty
		if(head == null) {
			addAtFront(num);
		}
		else {
			while(current.getNext() != null) {
				current = current.getNext();
			}
			//store data in temp
			temp.setData(num);
			
			//temp's next will be null - because temp is last node of the list
			temp.setNext(null);
			
			//temp's previous will be current - because current is last node before adding temp
			temp.setPrevious(current);
			
			//
			current.setNext(temp);
		}
		System.out.println(num + " added successfully at the end!");
	}

	@Override
	public void printList() {
		ListNode temp = head;
		
		//check if listnode is empty
		if(head == null)
			System.out.println("List is empty!");
		else {
			while(temp != null) {
				System.out.print(temp.getData() + " -> ");
				temp = temp.getNext();
			}
		}
	}

}
