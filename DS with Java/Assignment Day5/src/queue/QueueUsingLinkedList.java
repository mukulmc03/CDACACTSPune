package queue;

public class QueueUsingLinkedList implements QueueInterface {

	public class ListNode{
		int data;
		ListNode next;
	}
	
	ListNode front, rear;
	
	public QueueUsingLinkedList() {
		front = null;
		rear = null;
	}
	
	@Override
	public void enQueue(int value) {
		//check if list is empty
		if(rear == null) {
			//create a new node to add to the linked list
			ListNode newNode = new ListNode();
			newNode.data = value;
			newNode.next = null;
			rear = newNode;
			front = newNode;
			System.out.println(value + " added to the Queue!");
		}
		else {
			ListNode current = new ListNode();
			current = rear;
			ListNode newNode = new ListNode();
			while(current.next != null) {
				current = current.next;
			}
				newNode.data = value;
				newNode.next = null;
				current.next = newNode;
			System.out.println(value + " added to the Queue!");
		}
	}

	@Override
	public void deQueue() {
		if(front == null) {
			System.out.println("Queue is empty!");
		}
		else{
			System.out.println(front.data + " deleted from the Queue!");
			front = front.next;
			rear = rear.next;
		}
	}

	@Override
	public void display() {
		if(rear == null) {
			System.out.println("Queue is empty!");
		}
		else {
			ListNode current = rear;
			while(current != null) {
				System.out.print(current.data + " -> ");
				current = current.next;
			}
		}
	}

}
