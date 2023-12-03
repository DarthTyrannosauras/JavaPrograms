package com.cms.validation;

import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.customException.EmailNotFoundException;
import com.cms.customException.WrongPasswordException;

public class OtherValidations {
	public static int validateEmailAvailability(String email, List<Customer> customerList) throws EmailNotFoundException {
		Customer tempCustomer = new Customer(email);
		if(customerList.contains(tempCustomer)) {
			return customerList.indexOf(tempCustomer);
		}
		throw new EmailNotFoundException("Email ID Already Registered!!!");
	}
	
	public static void validateEmailPassword(String email, String password, Set<Customer> customerSet) throws EmailNotFoundException, WrongPasswordException {
		//Customer tempCustomer = new Customer(email);
		for(Customer c: customerSet) {
			if(c.getEmail().equals(email)) {
				if(!(c.getPassword().equals(password))) {
					throw new WrongPasswordException("Entered Password does not match!!");
				}
			}
			else
				throw new EmailNotFoundException("This email is not registered!! \nKindly enter correct mail id or Sign up!!");
		}
	}
//		if(customerSet.contains(tempCustomer)) {
//			if (customerList.get(customerList.indexOf(tempCustomer)).getPassword().equals(password)) {
//				System.out.println("Logged in successfully!!");
//				return customerList.indexOf(tempCustomer);
			
//			}
//			else 
//				throw new WrongPasswordException("Entered Password does not match!!");
//		}
//		throw new EmailNotFoundException("This email is not registered!! \nKindly enter correct mail id or Sign up!!");
//	}
	
	public static int validateEmailPassword(String email, String password, List<Customer> customerList) throws EmailNotFoundException, WrongPasswordException {
		Customer tempCustomer = new Customer(email);
		if(customerList.contains(tempCustomer)) {
			if (customerList.get(customerList.indexOf(tempCustomer)).getPassword().equals(password)) {
				System.out.println("Logged in successfully!!");
				return customerList.indexOf(tempCustomer);
			}
			else 
				throw new WrongPasswordException("Entered Password does not match!!");
		}
		throw new EmailNotFoundException("This email is not registered!! \nKindly enter correct mail id or Sign up!!");
	}	
	public static void upgradePlan(List<Customer> customerList) {
		for(Customer c : customerList) {
			if(c.getPlan()==ServicePlan.SILVER) {c.setPlan(ServicePlan.GOLD);c.setBalance(2000);}
			if(c.getPlan()==ServicePlan.GOLD) {c.setPlan(ServicePlan.DIAMOND);c.setRegistrationAmount(5000);}
			if(c.getPlan()==ServicePlan.DIAMOND) {c.setPlan(ServicePlan.PLATINUM);c.setRegistrationAmount(2000);}
			if(c.getPlan()==ServicePlan.PLATINUM) {c.setPlan(ServicePlan.PLATINUM);c.setRegistrationAmount(2000);}
		}
	}
}
