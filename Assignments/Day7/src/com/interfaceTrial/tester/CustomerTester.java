package com.interfaceTrial.tester;

import java.util.Scanner;

import com.interfaceTrial.core.Customer;
import com.interfaceTrial.core.FixedStack;
import com.interfaceTrial.core.GrowableStack;

public class CustomerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FixedStack stack1 = new FixedStack();
		GrowableStack stack1 = new GrowableStack();
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Enter details");
			stack1.push(new Customer("Mihir", 10, "Satara"));
			System.out.println(stack1.display());
			stack1.push(new Customer("AAA", 10, "XXX"));
			System.out.println(stack1.display());
			stack1.push(new Customer("BBB", 10, "XXX"));
			System.out.println(stack1.display());
			stack1.push(new Customer("CCC", 10, "XXX"));
			System.out.println(stack1.display());
			stack1.push(new Customer("CCd", 10, "XXX"));
			System.out.println(stack1.display());
			stack1.push(new Customer("CCe", 10, "XXX"));
			System.out.println(stack1.display());
			stack1.push(new Customer("CCf", 10, "XXX"));
			System.out.println(stack1.display());
			stack1.pop();
			//System.out.println(stack1.display());
			stack1.pop();
			//System.out.println(stack1.display());
			stack1.pop();
			//System.out.println(stack1.display());
			stack1.pop();
			//System.out.println(stack1.display());
			stack1.pop();
			//System.out.println(stack1.display());
			stack1.pop();
			//System.out.println(stack1.display());
			stack1.push(new Customer("AAA", 10, "XXX"));
			System.out.println(stack1.display());
			stack1.push(new Customer("BBB", 10, "XXX"));
			System.out.println(stack1.display());
		}
		catch(Exception e) {
			System.out.println("Excception found!");
			e.printStackTrace();
		}
	}

}
