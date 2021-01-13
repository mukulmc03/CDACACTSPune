package linkedList;

public class LinkedListClass implements LinkedListInterface {
	public ListNode tail = null;
	
	@Override
	public void addAtEnd(int num) {
		ListNode temp = new ListNode(num);
		
		//Checks if the list is empty  
		if(head == tail) {
			//If list is empty, both head and tail will point to temp  
			head = temp;
			tail = temp;
		}
		else {
			//temp will be added after tail such that tail's next will point to temp  
			tail.setNext(temp);
			//temp will become new tail of the list
			tail = temp;
		}
	}

	@Override
	public void insert(int num) {
		ListNode middleNode = new ListNode();
		ListNode current = new ListNode();
		ListNode previous = new ListNode();
		
		previous = null;
		current = head;
		
		//check if list is empty
		if(head == null)
			//add element at front - if empty
			addToFront(num);
		else {
			// traverse & check if num is greater than that of list node
			while(current != null && current.getData() < num) {
				// assign pointers to move forward
				previous = current;
				current = current.getNext();
			}
			// check if num is lesser than 1st listnode
			if(previous == null) {
				//store num to 1st listnode
				middleNode.setData(num);
				//set middleNode's next part as a head (because head consists of existing 1st listnode)
				middleNode.setNext(head);
				//so that head should consists address of 1st node(middleNode) after insert
				head = middleNode;
				System.out.println(num + " added successfully!");
			}
			//check if num is greater than last listnode
			else if(current == null) {
				//add num to last listNode
				middleNode.setData(num);
				//previous will contain middleNode's address
				previous.setNext(middleNode);
				//middleNode's next will point to current (null - end of the list)
				middleNode.setNext(current);
				System.out.println(num + " added successfully!");
			}
			// check if num fits in the middle of the list
			else {
				//add num to the middle of the list
				middleNode.setData(num);
				//previous will contain middleNode's address 
				previous.setNext(middleNode);
				//midddleNode's next will point to currentn(next node in listnode)
				middleNode.setNext(current);
				System.out.println(num + " added successfully!");
			}
		}
	}

	private ListNode head;
	private int count;

	@Override
	public void addToFront(int num) {
		//create a temporary node to point to first node
		ListNode temp = new ListNode(num, head);
		//temp points to the first node in the list
		head = temp;
		System.out.println(num + " added successfully!");
	}

	@Override
	public void printList() {
		ListNode temp = head;
		// traversing to print list until temp is empty
		while(temp != null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
	}

	@Override
	public int count() {
		ListNode temp = new ListNode();
		while(temp != null) {
			count ++;
			temp = temp.getNext();
		}
		return count;
	}

	@Override
	public int countFrequency(int num) {
		int frequency = 0;
		ListNode temp = head;
		while(temp != null) {
			if(temp.getData() == num)
				frequency ++;
			temp = temp.getNext();
		}
		return frequency;
	}

	@Override
	public boolean find(int num) {
		ListNode temp = head;
		while(temp != null) {
			if(temp.getData() == num)
				return true;
			temp = temp.getNext();
		}
		return false;
	}
}
