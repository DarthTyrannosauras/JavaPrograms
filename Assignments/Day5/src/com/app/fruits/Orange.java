package com.app.fruits;

public class Orange extends Fruit {
	public Orange(String name, String color, double weight, boolean fresh) {
		super(name, color, weight, fresh);
	}

	@Override
	public String taste() {
		return "Sour";
	}

	public void juice() {
		System.out.println("For " + super.getName() + "of " + super.getWeight() + "gm, Extracting Juice!");
	}
}
