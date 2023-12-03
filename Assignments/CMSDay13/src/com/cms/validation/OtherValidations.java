package com.cms.validation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.customException.EmailNotFoundException;
import com.cms.customException.WrongPasswordException;

public class OtherValidations {
	public static String validateEmailAvailability(String email, Map<String, Customer> customerMap)
			throws EmailNotFoundException {
		if (customerMap.containsKey(email)) {
			return email;
		}
		throw new EmailNotFoundException("Email ID Already Registered!!!");
	}

	public static String validateEmailPassword(String email, String password, Map<String, Customer> customerMap)
			throws EmailNotFoundException, WrongPasswordException {
		if (customerMap.containsKey(email)) {
			if (customerMap.get(email).getPassword().equals(password)) {
				System.out.println("Logged in successfully!!");
				return email;
			} else
				throw new WrongPasswordException("Entered Password does not match!!");
		} else
			throw new EmailNotFoundException(
					"This email is not registered!! \nKindly enter correct mail id or Sign up!!");
	}

	public static ArrayList<String> checkLastPaymentInterval(Map<String, Customer> customerMap){
		ArrayList<String> unpaidEmails = new ArrayList<>();
		
		return unpaidEmails;
		}
	}