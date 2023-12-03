package com.cms.core;

import java.time.LocalDate;

//import static java.time.LocalDate.of;
public class Customer implements Comparable<Customer> {
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private static int idGenerator;
	private ServicePlan plan;
	private double balance;
	private LocalDate regDate; 

	static {
		idGenerator = 0;
	}

	public Customer(String firstName, String lastName, String email, String password, double registrationAmount,
			LocalDate dob, ServicePlan plan) {
		this.customerId = ++idGenerator;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.registrationAmount = registrationAmount;
		this.dob = dob;
		this.plan = plan;
		this.balance = registrationAmount;
		this.regDate=LocalDate.now();
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer(String email) {
		this.email = email;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public double getRegistrationAmount() {
		return registrationAmount;
	}
	
	public void setRegistrationAmount(double registrationAmount) {
		this.registrationAmount = registrationAmount;
	}

	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}	

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "\nCustomer Details: \nCustomerId=" + customerId + ", \nName of customer: " + firstName+" " + lastName
				+ ", \nemail=" + email + /*", \npassword=" + password + ", \nregistrationAmount=" + registrationAmount
				+ */", \ndob=" + dob + "\nplan:" + plan.name();
	}

	public ServicePlan getPlan() {
		return plan;
	}
	
	@Override
	public boolean equals(Object obj2) {
		if (obj2 instanceof Customer) {
			Customer c2 = (Customer) obj2;
			if (this.email.equals(c2.email)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.email.compareTo(o.email);
	}

}
