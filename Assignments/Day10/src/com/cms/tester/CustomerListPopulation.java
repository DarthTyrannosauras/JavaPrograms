package com.cms.tester;

import java.util.ArrayList;
import java.util.List;
import com.cms.core.Customer;
import java.time.LocalDate;
import com.cms.core.ServicePlan;

public class CustomerListPopulation {
	public static List<Customer> populateCustomerList(){
		List<Customer> customerList = new ArrayList<>();
		customerList.add(new Customer("AAA","ZZZ","aaa@xyz.com","aaazzz1",1000,LocalDate.of(2000,10,10),ServicePlan.valueOf("SILVER")));
		customerList.add(new Customer("AAB","ZZZ","aab@xyz.com","aaazzz2",2000,LocalDate.of(2000,9,10),ServicePlan.valueOf("GOLD")));
		customerList.add(new Customer("ABA","ZZZ","aba@xyz.com","aaazzz3",1000,LocalDate.of(2004,10,10),ServicePlan.valueOf("SILVER")));
		customerList.add(new Customer("BAA","ZZZ","baa@xyz.com","aaazzz4",5000,LocalDate.of(2002,5,10),ServicePlan.valueOf("DIAMOND")));
		customerList.add(new Customer("ABB","ZZZ","abb@xyz.com","aaazzz5",1000,LocalDate.of(2003,10,23),ServicePlan.valueOf("SILVER")));
		customerList.add(new Customer("BBB","ZZZ","bbb@xyz.com","aaazzz6",10000,LocalDate.of(2000,3,29),ServicePlan.valueOf("PLATINUM")));
		return customerList;
	}
}
/*String firstName, String lastName, String email, String password, double registrationAmount,
LocalDate dob, ServicePlan plan*/