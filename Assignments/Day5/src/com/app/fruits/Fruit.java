package com.app.fruits;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean fresh;

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}

	public String getName() {
		return name;
	}

	public boolean isFresh() {
		return fresh;
	}

	public Fruit(String name, String color, double weight, boolean fresh) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.fresh = fresh;
	}

	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}

	public String toString() {
		return "Name: " + this.name + " Color: " + this.color + " weight(in grams): " + this.weight;
	}
	
	@Override
	public boolean equals(Object obj2) {
		if(obj2 instanceof Fruit) {
			Fruit fruit2 = (Fruit)obj2;
			if(!(name.equals(fruit2.name))) {return false;}
			return true;
		}
		return false;
	}

	public String taste() {
		return "No Specific Taste";
	}
}
