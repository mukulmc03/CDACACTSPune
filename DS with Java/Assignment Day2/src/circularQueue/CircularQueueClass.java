package circularQueue;

import queue.QueueInterface;

public class CircularQueueClass implements QueueInterface {
	private int[] circularQueue;
	private int front = 0, rear = 0;
	
	public CircularQueueClass(int size) {
		circularQueue =new int[size + 1]; 
	}
	
	@Override
	public void enQueue(int value) {
		if(!isFull()) {
			circularQueue[rear] = value;
			rear = (rear + 1) % circularQueue.length;
			System.out.println(value + " added to the Queue!");
		}
		else
			System.out.println("Queue Overflow!");
	}

	@Override
	public void deQueue() {
		if(!isEmpty()) {
			circularQueue[front] = 0;
			front = (front + 1) % circularQueue.length;
			System.out.println(circularQueue[front] + " deleted from the Queue!");
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
		if((rear + 1) % circularQueue.length == front)
			return true;
		return false;
	}

	@Override
	public void display() {
		for(int i : circularQueue)
			if(i != 0)
				System.out.println(i + " ");
	}
}
