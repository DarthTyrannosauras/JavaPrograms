package com.cms.tester;

import java.util.HashSet;
import java.util.Scanner;

import com.cms.core.Customer;

import static com.cms.tester.CustomerSetPopulation.populateCustomerset;;

public class HashSetTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Customer> customerSet = populateCustomerset();
		boolean exitFlag = false;
		int userChoice;
		int index;
		System.out.println("Welcome to Pamazon Arime!");
		try (Scanner sc = new Scanner(System.in)){
			while(!exitFlag) {
				try {
					//System.out.println("1:Sign up\n2:Sign in\n3:Change pwd\n4:Unsubscribe\n5:Display All\n6:Exit");
					System.out.println("\n1:Display All\n2:Add Customers\n5:Exit");
					userChoice = sc.nextInt();
					switch (userChoice) {
					case 1://Printing elements of HashSet: Using Iterator:
						for(Customer c : customerSet) {
							System.out.println(c);
						}
						break;
						
					case 2://Adding Customers
					case 5://Exit
						exitFlag=true;
						System.out.println("Exiting program!!");
						break;
					}
					
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}

	}

}
