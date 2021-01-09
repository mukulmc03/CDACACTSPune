package queue;

public class QueueClass implements QueueInterface {
	private int front = 0, rear = 0;
	private int[] queue;
	
	public QueueClass(int size) {
		queue = new int[size];
	}
	
	@Override
	public void enQueue(int value) {
		if(!isFull()) {
			queue[rear] = value;
			rear ++;
			System.out.println(value + " added to the Queue!");
		}
		else
			System.out.println("Queue Overflow!");
	}

	@Override
	public void deQueue() {
		if(!isEmpty()) {
			front --;
			System.out.println("Deleted from the Queue!");
		}
		else
			System.out.println("Queue Underflow!");
	}

	@Override
	public boolean isEmpty() {
		if(front == rear)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		if(rear == queue.length)
			return true;
		return false;
	}

	@Override
	public void display() {
		System.out.println("Queue elements are : ");
		for(int i : queue)
			System.out.println(i + " ");

	}

}
