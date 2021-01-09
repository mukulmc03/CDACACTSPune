package queue;

public interface QueueInterface {
	public void enQueue(int value);
	public void deQueue();
	public boolean isEmpty();
	public boolean isFull();
	void display();
}
