package com.app.fruits;

public class Apple extends Fruit {
	public Apple(String name, String color, double weight, boolean fresh) {
		super(name, color, weight, fresh);
	}

	@Override
	public String taste() {
		return "Sweet n Sour";
	}

	public void jam() {
		System.out.println("For " + super.getName() + "Apple Making Jam!");
	}
}
