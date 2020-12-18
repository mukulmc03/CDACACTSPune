package com.app.org;

public class FixedStack implements StackInterface{
	private Employee emp[];
	private int top;
	
	public FixedStack() {
		emp = new Employee[STACK_SIZE];
		top = -1;
	}
	
	public void push(Employee e) {
		if(top < STACK_SIZE - 1)
			emp[++ top] = e;
		else
			System.out.println("Fixed Stack is Full!");
	}
	
	public Employee pop() {
		if(top < 0)
			return null;
		else
			return emp[top --];
	}
}
