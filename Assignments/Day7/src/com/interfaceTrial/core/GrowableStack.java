package com.interfaceTrial.core;

public class GrowableStack implements Stack {

	Customer[] stack;
	int counter;
	int currentSize;

	public GrowableStack() {
		// super();
		// super(null, 0, null);
		this.stack = new Customer[STACK_SIZE];
		this.counter = -1;
		this.currentSize = STACK_SIZE;
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		if (this.counter >=0) {
			if(counter==this.currentSize) {counter--;}
			System.out.println("Popping: " + stack[counter].toString());
			stack[counter--] = null;
		} else
			System.out.println("Stack Empty!!!");
	}

	@Override
	public void push(Customer value) {
		// TODO Auto-generated method stub
		if (this.counter < stack.length-1) {
			stack[++counter] = value;
		} 
		else {
			Customer[] stack2 = new Customer[stack.length+1];
			for(int i=0;i<stack.length;i++) {
				stack2[i]=stack[i];
			}
			stack=stack2;
			stack[++counter] = value;
			this.currentSize=counter;
		}
	}

	public String display() {
		if (counter >= 0) {
			return stack[counter].toString();
		} else
			return "No data!!";
	}

}
