package stack;

public class StackClass implements StackInterface {
	private int[] stack;
	private int top = -1;
	
	//implementing class Constructor
	public StackClass(int size) {
		stack = new int[size];
	}

	@Override
	public void push(int value) {
		if (!isFull()) {
			top++;
			stack[top] = value;
			System.out.println(value + " pushed to Stack!");
		}
		else
			System.out.println("Stack Overflow!");
	}

	@Override
	public void pop() {
		if(!isEmpty()) {
			top --;
			System.out.println(stack[top] + " popped from Stack!");
		}
		else
			System.out.println("Stack Underflow!");
	}

	@Override
	public boolean isEmpty() {
		if(top == -1)
			return true;
		return false;
	}

	@Override
	public boolean isFull() {
		if(top == stack.length - 1)
			return true;
		return false;
	}

	@Override
	public void display() {
		System.out.println("Stack elements are : ");
		for(int i : stack)
			System.out.println(i + " ");
	}

	@Override
	public void reversedDisplay() {
		System.out.println("Stack elements in Reversed Order are : ");
		for(int i = top ; i >= 0 ; i--)
			System.out.println(stack[i] + " ");
	}
}
