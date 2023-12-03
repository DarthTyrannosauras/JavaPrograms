package com.cms.tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cms.core.Customer;
import com.cms.core.CustomerOrderingRegAmt;
import com.cms.core.ServicePlan;
import com.cms.customException.*;

import static com.cms.validation.CustomerCreationValidation.validateAll;
import static com.cms.validation.OtherValidations.validateEmailPassword;
import static com.cms.validation.CustomerCreationValidation.validateEmail;

import static com.cms.tester.CustomerListPopulation.populateCustomerList;

import static java.util.Collections.*;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(ServicePlan.valueOf("GOLD"));
		// List<Customer> customerList = new ArrayList<>();
		List<Customer> customerList = populateCustomerList();
		boolean exitFlag = false;
		int userChoice;
		int index;
		System.out.println("Welcome to Pamazon Arime!");
		try (Scanner sc = new Scanner(System.in)) {
			while (!exitFlag) {
				try {
					System.out.println("1:Sign up\n2:Sign in\n3:Change pwd\n4:Unsubscribe\n5:Display All\n6:Exit");
					userChoice = sc.nextInt();
					switch (userChoice) {
					case 1:// Sign up
						System.out.println("Dear customer, following plans are available:\n" + "SILVER : $1000\n"
								+ "GOLD : $2000\n" + "DIAMOND : $5000\n" + "PLATINUM : $1000\n");
						System.out.println("Kindly enter your mail id for registration");
						String email = sc.next();
						validateEmail(email, customerList);
						System.out.println("Enter the following details on order:firstName, lastName, password,"
								+ "registrationAmount,dob(yyyy-mm-dd),plan name");
						customerList.add(validateAll(email, sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), customerList));
						System.out.println("Customer Created!!");
						break;

					case 2:// Sign in
						System.out.println("Enter email id and password:");
						validateEmailPassword(sc.next(), sc.next(), customerList);
						break;

					case 3:// Change password
						System.out.println("Enter email id and password:");
						index = validateEmailPassword(sc.next(), sc.next(), customerList);
						System.out.println("Enter new Password:");
						customerList.get(index).setPassword(sc.next());
						System.out.println("Password changed successfully!!\nUpdated customer details are:");
						System.out.println(customerList.get(index).toString());
						break;

					case 4:
						System.out.println("Enter email id and password:");
						index = validateEmailPassword(sc.next(), sc.next(), customerList);
						System.out.println("Unsubscribing customer...");
						customerList.remove(index);
						System.out.println("Customer Unsubscribed successfully!!");
						break;

					case 5:
						if (customerList.size() == 0)
							throw new EmptyCustomerListException("No customers created!!");
						for (Customer c : customerList) {
							System.out.println(c.toString());
						}
						break;

					case 6:
						exitFlag = true;
						System.out.println("Exiting program!!!");
						break;

					case 7:// Delete all silver numbers
						System.out.println("Kicking off Silver subscribers!!!!");
						/*for(Customer c : customerList) {
							if(c.getPlan().name().equals("SILVER")) {
								customerList.remove(c);
							}
						}*/
						//For iteration, currently default iterator is assigned. Need to use the explicit iterator
						Iterator<Customer> customerIterator = customerList.iterator();
						while(customerIterator.hasNext()) {
							if(customerIterator.next().getPlan().name().equals("SILVER")) {
								customerIterator.remove();
							}
						}
						break;
						
					case 8:// Sorting acc to email id : Primary Key
						System.out.println("Unsorted:");
						if (customerList.size() == 0)
							throw new EmptyCustomerListException("No customers created!!");
						for (Customer c : customerList) {
							System.out.println(c.toString());
						}
						sort(customerList);
						System.out.println("\nSorted acc to email id:");
						if (customerList.size() == 0)
							throw new EmptyCustomerListException("No customers created!!");
						for (Customer c : customerList) {
							System.out.println(c.toString());
						}
						break;
						
					case 9:// Sorting acc to Registration Amount
						System.out.println("Unsorted:");
						if (customerList.size() == 0)
							throw new EmptyCustomerListException("No customers created!!");
						for (Customer c : customerList) {
							System.out.println(c.toString());
						}
						sort(customerList,new CustomerOrderingRegAmt());
						System.out.println("\n Sorted acc to registration plan:");
						if (customerList.size() == 0)
							throw new EmptyCustomerListException("No customers created!!");
						for (Customer c : customerList) {
							System.out.println(c.toString());
						}
						break;

					default:
						System.out.println("Enter correct choice!!");
						break;
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
					sc.nextLine();
				}
			}

		}
	}
}
