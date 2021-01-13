package doublyLinkedList;

public class ListNode {
	private int data;
	private ListNode previous; 
	private ListNode next;
	
	public ListNode(int data, ListNode previous, ListNode next) {
		super();
		this.data = data;
		this.previous = previous;
		this.next = next;
	}
	
	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getPrevious() {
		return previous;
	}
	public void setPrevious(ListNode previous) {
		this.previous = previous;
	}
	public ListNode getNext() {
		return next;
	}
	public void setNext(ListNode next) {
		this.next = next;
	}
	
	
}
