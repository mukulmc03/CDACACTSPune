package com.app.org;

public class GrowableStack implements StackInterface{
	private Employee emp[];
	private int top;
	
	public GrowableStack() {
		emp = new Employee[STACK_SIZE];
		top = -1;
	}
	
	public void push(Employee e) {
		if(top < STACK_SIZE - 1)
			emp[++ top] = e;
		else {
			emp = newEmployeeArray(emp);
			emp[++ top] = e;
		}
	}
	
	public Employee pop() {
		if(top < 0)
			return null;
		else
			return emp[top --];
	}
	
	int length = 0, bound = STACK_SIZE * 2; 
	public Employee[] newEmployeeArray(Employee[] emp){ 
        Employee[] newEmp = new Employee[length + bound]; 
      
        for(int i = 0; i < length; i++){ 
            newEmp[i] = emp[i]; 
        }
      
        length += bound; 
        return newEmp; 
    }  
}
