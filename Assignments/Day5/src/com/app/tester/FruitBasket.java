package com.app.tester;

import java.util.Scanner;

import com.app.fruits.*;

public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the basket.");
		Fruit[] basket = new Fruit[sc.nextInt()];
		int userChoice;
		int counter = 0;

		boolean exitFlag = false;
		int userIndex;
		while (!exitFlag) {
			System.out.println("Enter 1:Add Mango 2:Add Orange 3:Add Apple\n4:Display All fruits in Basket");
			System.out.println(
					"5:Display details of all fresh fruits\n6:Mark a fruit as stale\n7:Mark all sour fruits stale");
			System.out.println("8:Invoke Special Functionality\n9:Exit");
			userChoice = sc.nextInt();
			switch (userChoice) {
			case 1:// Add Mango
				System.out.println("Enter the details for Mango in following order: name, color, weight in grams");
				basket[counter++] = new Mango(sc.next(), sc.next(), sc.nextDouble(), true);
				break;

			case 2:// Add Orange
				System.out.println("Enter the details for Orange in following order: name, color, weight in grams");
				basket[counter++] = new Orange(sc.next(), sc.next(), sc.nextDouble(), true);
				break;

			case 3:// Add Apple
				System.out.println("Enter the details for Apple in following order: name, color, weight in grams");
				basket[counter++] = new Apple(sc.next(), sc.next(), sc.nextDouble(), true);
				break;

			case 4:// Display all fruit names in basket
				for (Fruit f : basket) {
					if (f != null) {
						System.out.println(f.getName());
					}
				}
				break;

			case 5:// Display name, color, weight, taste of all FRESH fruits
				for (Fruit f : basket) {
					if (f != null && f.isFresh() == true) {
						System.out.println(f + f.taste());
					}
				}
				break;

			case 6:// Mark a fruit in basket as stale
				System.out.println("Enter the number of the fruit in basket to mark as not stale");
				userIndex = sc.nextInt() - 1;
				if (userIndex >= 0 && userIndex < counter) {
					basket[userIndex].setFresh(false);
					System.out.println("Fruit marked as false");
				} else {
					System.out.println("Fruit not found!!");
				}
				break;

			case 7:// Mark all sour fruits stale
				for (Fruit f : basket) {
					if (f != null && f.taste() == "Sour") {
						f.setFresh(false);
					}
				}
				break;

			case 8:// Invoke specific functionality
				System.out.println("Enter the number of the fruit in basket to get ");
				userIndex = sc.nextInt() - 1;
				if (userIndex >= 0 && userIndex < counter) {
					Fruit f1 = basket[userIndex];
					if (f1 instanceof Apple) {
						((Apple) f1).jam();
					}
					if (f1 instanceof Mango) {
						((Mango) f1).pulp();
					}
					if (f1 instanceof Orange) {
						((Orange) f1).juice();
					}
				}
				break;

			case 9:// Exit
				exitFlag = true;
				System.out.println("Exiting Program...");
				break;

			default:
				System.out.println("Enter from available choices!!");
			}
		}

		sc.close();
	}

}
