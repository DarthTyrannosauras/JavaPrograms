package com.interfaceTrial.tester;

import java.util.Scanner;

import com.interfaceTrial.core.*;

public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = null;
		int userChoice;
		boolean exitFlag = false;
		boolean stackSelection=false;
		System.out.println("Welcome to customer stack!!");
		try (Scanner sc = new Scanner(System.in)) {
			while (!exitFlag) {
				System.out.println("1: Fixed size Stack\n2: Growable Stack\n3:Pushing data into stack"
						+ "\n4: Popping data from stack\n5:Exiting program");
				userChoice = sc.nextInt();
				switch (userChoice) {
				case 1://Choose Fixed Stack
					if(!stackSelection) {
						stack = new FixedStack();
						stackSelection=true;
						}
					else
						if(stack instanceof FixedStack)
							System.out.println("Cannot reinitialize stack!!");
						else 
							System.out.println("Cannot change stack type!!");
					break;
					
				case 2://Choose Growable stack
					if(!stackSelection) {
						stack = new GrowableStack();
						stackSelection=true;
						}
					else
						if(stack instanceof GrowableStack)
							System.out.println("Cannot reinitialize stack!!");
						else 
							System.out.println("Cannot change stack type!!");
					break;
					
				case 3://Push data
					if (stack!=null) {
					System.out.println("Enter the details of customer in order name, id, address");
					stack.push(new Customer(sc.next(),sc.nextInt(),sc.next()));
					if (stack instanceof FixedStack) {
						System.out.println("Details of entered customer are: " + ((FixedStack)stack).display());
					}
					if (stack instanceof GrowableStack) {
						System.out.println("Details of entered customer are: " + ((GrowableStack)stack).display());
					}
					}
					else
						System.out.println("Stack not chosen!!");
					break;
					
				case 4://Pop data
					if (stack!=null) {
						//System.out.println("Enter the details of customer in order name, id, address");
						stack.pop();
						}
						else
							System.out.println("Stack not chosen!!");
					break;
					
				case 5: //Exit
					exitFlag=true;
					System.out.println("Exiting the program!!");
					break;
					
				default: 
					System.out.println("Enter choice betn 1 to 5!!!");
					break;
				}
			}
		}
	}

}
