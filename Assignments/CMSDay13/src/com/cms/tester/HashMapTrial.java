package com.cms.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.cms.core.CustomOrderingSeqTreeMap;
import com.cms.core.CustomOrderingServicePlan;
import com.cms.core.Customer;
import com.cms.core.ServicePlan;

import static com.cms.tester.CustomerMapPopulation.populateCustomerMap;
import static com.cms.validation.CustomerCreationValidation.validateAll;
import static com.cms.validation.CustomerCreationValidation.validateEmail;
import static com.cms.validation.OtherValidations.validateEmailPassword;;

public class HashMapTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<String, Customer> customerMap = new HashMap<>();
		HashMap<String, Customer> customerMap = populateCustomerMap();
		boolean exitFlag = false;
		int userChoice;
		String email;
		try (Scanner sc = new Scanner(System.in)){
			while(!exitFlag) {
				System.out.println("\n\nWelcome to Pamazon Arime!");
				try {
					//System.out.println("1:Sign up\n2:Sign in\n3:Change pwd\n4:Unsubscribe\n5:Display All\n6:Exit");
					System.out.println("\n1:Display All\n2:Add Customers\n0:Exit");
					userChoice = sc.nextInt();
					switch (userChoice) {
					case 1://Printing elements of HashMap: Using Iterator:
						for(Customer c : customerMap.values()) {
							System.out.println(c);
						}
						break;
						
					case 2://Adding Customers
						System.out.println("Dear customer, following plans are available:\n" + "SILVER : $1000\n"
								+ "GOLD : $2000\n" + "DIAMOND : $5000\n" + "PLATINUM : $1000\n");
						System.out.println("Kindly enter your mail id for registration");
						email=validateEmail(sc.next(), customerMap);
						System.out.println("Enter the following details on order:firstName, lastName, password,"
								+ "registrationAmount,dob(yyyy-mm-dd),plan name,registration Date");
						customerMap.put(email,validateAll(email, sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),
								sc.next(), sc.next(), customerMap));
						System.out.println("Customer Created!!");
						break;
						
					case 3://Sign in
						System.out.println("Enter email id and password:");
						validateEmailPassword(sc.next(), sc.next(), customerMap);
						break;
						
					case 4://Change Password
						System.out.println("Enter email id and password:");
						email = validateEmailPassword(sc.next(), sc.next(), customerMap);
						System.out.println("Enter new password:");
						customerMap.get(email).setPassword(sc.next());
						System.out.println("Password changed successfully!!!");
						break;
						
					case 5://Unsubscribe customer:
						System.out.println("Enter email id and password:");
						email = validateEmailPassword(sc.next(), sc.next(), customerMap);
						System.out.println("Unsubscribing...");
						Customer cust1 = customerMap.remove(email);
						System.out.println("Ubsubscribed!!!\nThe details of the removed customer are:\n" + cust1);
						break;
						
						
					case 6://Sorting based on customer email:
						/*
						 * customerMap.values() is a collection.
						 * (ArrayList<Customer>) is DOWNCASTING OF COLLECTion to ArrayList.
						 * Leads to Class Cast Exception!!!
						 * */
						//ArrayList<Customer> customerList = (ArrayList<Customer>) customerMap.values();
						List<Customer> customerList=new ArrayList<>(customerMap.values());
						Collections.sort(customerList);
						System.out.println("Sorted acc to mail id:");
						for(Customer c : customerList) {
							System.out.println(c);
						}
						break;
						
					case 7://Sorting based on plan:
						customerList=new ArrayList<>(customerMap.values());
						Collections.sort(customerList,new CustomOrderingServicePlan());
						System.out.println("Sorted acc to Service plan:");
						for(Customer c : customerList) {
							System.out.println(c);
						}
						break;
						
					case 8://Unsubscribing based on last payment done
						//If >6 months , unsubscribe forcefully.
						ArrayList<String> unpaidEmails = checkLastPaymentInterval(customerMap);
						break;
						
					case 9://Sorting based on customer email: TreeMap
						/*
						 * customerMap.values() is a collection.
						 * (ArrayList<Customer>) is DOWNCASTING OF COLLECTion to ArrayList.
						 * Leads to Class Cast Exception!!!
						 * */
						//ArrayList<Customer> customerList = (ArrayList<Customer>) customerMap.values();
						Map<String, Customer> customerTreeMap=new TreeMap<>(customerMap);
						System.out.println("Sorted acc to mail id:");
						for(Customer c : customerTreeMap.values()) {
							System.out.println(c);
						}
						break;
						
					case 10://Sorting based on plan:
						customerTreeMap = new TreeMap<String, Customer>(new CustomOrderingSeqTreeMap());
						Collections.sort(customerList,new CustomOrderingServicePlan());
						System.out.println("Sorted acc to Service plan:");
						for(Customer c : customerList) {
							System.out.println(c);
						}
						break;
						
					case 0://Exit
						exitFlag=true;
						System.out.println("Exiting program!!");
						break;
					}
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
					sc.nextLine();
				}
			}
		}

	}

}
