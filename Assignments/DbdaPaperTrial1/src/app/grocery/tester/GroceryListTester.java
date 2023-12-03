package app.grocery.tester;

import static app.grocery.tester.PopulateGroceryList.populateGroceryList;

import java.util.List;
import java.util.Scanner;

import app.grocery.core.GroceryItem;

public class GroceryListTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List<GroceryItem> groceryList = new ArrayList<>();
		List<GroceryItem> groceryList = populateGroceryList();
		boolean exitFlag=false;
		int userChoice,index;
		try(Scanner sc = new Scanner(System.in)){
			while(!exitFlag){
				try {
					System.out.println("Welcome to FreshMart!");
					System.out.println("1.New \n2.Update Qty\n3.Display\n4.RemoveIfEmpty\n5.StockUpdatedin3days");
					userChoice=sc.nextInt();
					switch(userChoice) {
					case 1://New
						System.out.println("Enter Name, Price per unit, Qty in stock, StockUpdateDate, StockUpdateTime");
						groceryList.add(validateAll(sc.next(),sc.nextDouble(),sc.nextInt(),sc.next(),sc.next()));
						break;
					case 2:	
						break;
					case 3:
						break;
					case 4:
						break;
					case 5:
						break;
					case 0:
						exitFlag=true;
						System.out.println("Exiting program!!");
						break;
					}
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

}
