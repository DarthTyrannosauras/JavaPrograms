package com.interfaceTrial.core;

//import static com.interfaceTrial.core.Stack.STACK_SIZE;;
public class FixedStack implements Stack {

	Customer[] stack;
	int counter;

	public FixedStack() {
		// super();
		// super(null, 0, null);
		this.stack = new Customer[STACK_SIZE];
		this.counter = -1;
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if (this.counter >= 0) {
			if(this.counter == STACK_SIZE) {counter--;}
			System.out.println("Popping: "+stack[counter].toString());
			stack[counter--] = null;
		} else
			System.out.println("Stack Empty!!!");
	}

	@Override
	public void push(Customer value) {
		// TODO Auto-generated method stub
		if (this.counter < stack.length-1) {
			stack[++counter] = value;
		} else
			System.out.println("Stack full!!");
	}

	public String display() {
		if (counter >= 0) {
			return stack[counter].toString();
		} else
			return "No data!!";
	}

}
