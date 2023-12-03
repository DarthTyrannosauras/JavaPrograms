package com.cms.core;

import java.util.Comparator;

public class CustomOrderingServicePlan implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		// TODO Auto-generated method stub
		if(c1.getPlan().ordinal() > c2.getPlan().ordinal()) {return 1;}
		if(c1.getPlan().ordinal() < c2.getPlan().ordinal()) {return -1;}
		return 0;
	}

}
