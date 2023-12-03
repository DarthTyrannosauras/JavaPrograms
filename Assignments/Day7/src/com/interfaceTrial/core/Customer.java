package com.interfaceTrial.core;

public class Customer {
	private String name;
	private int id;
	private String Address;

	public Customer(String name, int id, String address) {
		super();
		this.name = name;
		this.id = id;
		Address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", id=" + id + ", Address=" + Address + "]";
	}

}
