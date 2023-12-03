package com.cms.tester;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;

import static com.cms.tester.CustomerSetPopulation.populateCustomerset;
import static com.cms.validation.CustomerCreationValidation.validateAll;
import static com.cms.validation.CustomerCreationValidation.validateEmail;
import static com.cms.validation.OtherValidations.validateEmailPassword;;

public class HashSetTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Customer> customerSet = populateCustomerset();
		boolean exitFlag = false;
		int userChoice;
		int index;
		/*System.out.println("Original price " + ServicePlan.GOLD.getCharges());
		ServicePlan.GOLD.setCharges(1500);
		System.out.println("Updatef Price: " + ServicePlan.GOLD.getCharges());*/
		System.out.println("Welcome to Pamazon Arime!");
		try (Scanner sc = new Scanner(System.in)) {
			while (!exitFlag) {
				try {
					// System.out.println("1:Sign up\n2:Sign in\n3:Change
					// pwd\n4:Unsubscribe\n5:Display All\n6:Exit");
					System.out.println("\n1:Display All\n2:Add Customers\n5:Exit");
					userChoice = sc.nextInt();
					switch (userChoice) {
					case 1:// Printing elements of HashSet: Using Iterator:
						for (Customer c : customerSet) {
							System.out.println(c);
						}
						break;

					case 2:// Adding Customers
						System.out.println("Dear customer, following plans are available:\n" + "SILVER : $1000\n"
								+ "GOLD : $2000\n" + "DIAMOND : $5000\n" + "PLATINUM : $1000\n");
						System.out.println("Kindly enter your mail id for registration");
						String email = sc.next();
						validateEmail(email, customerSet);
						System.out.println("Enter the following details on order:firstName, lastName, password,"
								+ "registrationAmount,dob(yyyy-mm-dd),plan name");
						customerSet.add(validateAll(email, sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), customerSet));
						System.out.println("Customer Created!!");
						break;

					case 3:// Sign in
							// ArrayList <Customer> customerList= new ArrayList(customerSet);
						System.out.println("Enter email id and password:");
						validateEmailPassword(sc.next(), sc.next(), customerSet);
						break;

					case 4:// CHange Pwd
//						ArrayList <Customer> customerList= new ArrayList(customerSet);
//						System.out.println("Enter email id and password:");
//						index = validateEmailPassword(sc.next(), sc.next(), customerList);
//						System.out.println("Enter new Password:");
//						customerList.get(index).setPassword(sc.next());
//						customerSet=null;
//						customerSet=new HashSet<>(customerList);

						break;
					case 5:// Exit
						exitFlag = true;
						System.out.println("Exiting program!!");
						break;
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
