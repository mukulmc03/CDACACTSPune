package stack;

public class StackUsingLinkedList implements StackInterface {
	//class to create a linkedlist node
	public class ListNode{
		//data of int type
		int data;		
		//next may contain null or address of next node so it is of listnode type
		ListNode next;
	}
		//stack top of listnode type - because we are implementing stack
		ListNode top;
		
		public StackUsingLinkedList(){
			top = null;
		}
	
	@Override
	public void push(int value) {
		//temp - to create a new node to push
		ListNode temp = new ListNode();
		//temp's data part will contain value
		temp.data = value;
		//temp's next will point to top - if top(temp.next) is null (temp is only element in stack)
		temp.next = top;
		//temp will be the new top
		top = temp;
		
		System.out.println(value + " pushed to stack!");
	}

	@Override
	public void pop() {
		int element = top.data;
		top = top.next;
		System.out.println(element + " popped from stack!");
	}

	@Override
	public void display() {
		//temp - new ListNode to travrese
		ListNode temp = new ListNode();
		//temp will contain value of top to check null condititon
		temp = top;
		//looping to print stack elements
		while(temp != null) {
			//print stack elements
			System.out.println(temp.data + " -> ");
			//temp will contain temp's next  
			temp = temp.next;
		}
	}

}
