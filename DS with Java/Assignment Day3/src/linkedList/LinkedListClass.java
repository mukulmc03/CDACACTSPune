package linkedList;

public class LinkedListClass implements LinkedListInterface {
	private ListNode head;
	private int count;

	@Override
	public void addToFront(int num) {
		ListNode temp = new ListNode(num, head);
		head = temp;
		count ++;
		System.out.println(num + " added successfully!");
	}

	@Override
	public void printList() {
		ListNode temp = head;
		while(temp != null) {
			System.out.print(temp.getData() + " -> ");
			temp = temp.getNext();
		}
	}

	@Override
	public int count() {
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
