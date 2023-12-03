package com.cms.tester;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;

public class CustomerMapPopulation {
	public static HashMap<String, Customer> populateCustomerMap() {
		HashMap<String, Customer> customerMap = new HashMap<>();
		customerMap.put("aaa@xyz.com", new Customer("AAA", "ZZZ", "aaa@xyz.com", "aaazzz1", 1000,
				LocalDate.of(2000, 10, 10), ServicePlan.valueOf("SILVER"),LocalDate.parse("2012/12/31")));
		customerMap.put("aab@xyz.com", new Customer("AAB", "ZZZ", "aab@xyz.com", "aaazzz2", 2000,
				LocalDate.of(2000, 9, 10), ServicePlan.valueOf("GOLD"),LocalDate.parse("2012/12/31")));
		customerMap.put("aba@xyz.com", new Customer("ABA", "ZZZ", "aba@xyz.com", "aaazzz3", 1000,
				LocalDate.of(2004, 10, 10), ServicePlan.valueOf("SILVER"),LocalDate.parse("2012/12/31")));
		customerMap.put("baa@xyz.com", new Customer("BAA", "ZZZ", "baa@xyz.com", "aaazzz4", 5000,
				LocalDate.of(2002, 5, 10), ServicePlan.valueOf("DIAMOND"),LocalDate.parse("2012/12/31")));
		customerMap.put("abb@xyz.com", new Customer("ABB", "ZZZ", "abb@xyz.com", "aaazzz5", 1000,
				LocalDate.of(2003, 10, 23), ServicePlan.valueOf("SILVER"),LocalDate.parse("2012/12/31")));
		customerMap.put("bbb@xyz.com", new Customer("BBB", "ZZZ", "bbb@xyz.com", "aaazzz6", 10000,
				LocalDate.of(2000, 3, 29), ServicePlan.valueOf("PLATINUM"),LocalDate.parse("2012/12/31")));
		return customerMap;

	}
}
