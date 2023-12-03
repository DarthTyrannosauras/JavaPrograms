package com.cms.core;

import java.util.Comparator;

public class CustomerOrderingRegAmt implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if(o1.getRegistrationAmount()<o2.getRegistrationAmount()) {return -1;}
		if(o1.getRegistrationAmount()>o2.getRegistrationAmount()) {return 1;}
		return 0;
	}
}
