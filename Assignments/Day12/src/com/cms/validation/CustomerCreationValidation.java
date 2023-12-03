package com.cms.validation;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.customException.AgeNotSatisfiedException;
import com.cms.customException.DuplicateCustomerFoundException;
import com.cms.customException.EmailNotFoundException;
import com.cms.customException.InsufficientAmountException;

public class CustomerCreationValidation {
	// String firstName, String lastName,
	// String email, String password, double registrationAmount,LocalDate
	// dob,ServicePlan plan
	public static Customer validateAll(String firstName, String lastName, String email, String password,
			double registrationAmount, String dob, String plan, Set<Customer> customerSet)
			throws AgeNotSatisfiedException, InsufficientAmountException, IllegalArgumentException,
			DuplicateCustomerFoundException {
		duplicateCustomerCheck(email, customerSet);
		LocalDate custDob = validateDob(dob);
		ServicePlan customerPlan = validatePlan(plan);
		validateRegistrationAmount(registrationAmount, customerPlan);
		Customer cust1 = new Customer(firstName, lastName, email, password, registrationAmount, custDob, customerPlan);
		return cust1;
	}

	public static void validateEmail(String email, Set<Customer> customerSet) throws EmailNotFoundException {
		Customer tempCustomer = new Customer(email);
		if (customerSet.contains(tempCustomer))
			throw new EmailNotFoundException("Email ID Already Registered!!!");
	}

	public static LocalDate validateDob(String sDob) throws AgeNotSatisfiedException {
		LocalDate dob = LocalDate.parse(sDob);
		LocalDate ageChecker = LocalDate.of(2006, 01, 01);
		if (ageChecker.isBefore(dob)) {
			throw new AgeNotSatisfiedException("Age below 18!!");
		}
		return dob;
	}

	public static ServicePlan validatePlan(String plan) throws IllegalArgumentException {
		return ServicePlan.valueOf(plan.toUpperCase());
	}

	public static void validateRegistrationAmount(double registrationAmount, ServicePlan plan)
			throws InsufficientAmountException {
		if (plan.getCharges() > registrationAmount) {
			throw new InsufficientAmountException("Registration Amount" + registrationAmount
					+ " is less than current plan value" + plan.getCharges() + "!!!");
		}
	}

	public static void duplicateCustomerCheck(String email, Set<Customer> customerSet)
			throws DuplicateCustomerFoundException {
		Customer tempCustomer = new Customer(email);
		if (customerSet.contains(tempCustomer)) {
			throw new DuplicateCustomerFoundException(
					"\nEmail ID already registered!! \nPlease sign in or change register with different email id!!\n");
		}
	}
}
