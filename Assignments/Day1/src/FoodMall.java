/*
	Display food menu to the user.
	User will select items from the menu and qty. Assign fixed prices to the items. Generate bill for option 10. Exit when bill generated.
*/

import java.util.Scanner;

class FoodMall{
	public static void main(String[] args){
		boolean bill = false;
		int userChoice, totalCost = 0, itemsOrdered=0, qtyOrdered = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to XXXX Hotel. Please select from 1 to 10. \n 10 to generate bill.");
		while(!bill){
			System.out.println("Enter your choice:");
			userChoice = sc.nextInt();
			if (userChoice != 10){
			System.out.println("Enter the quantity to be ordered");
			qtyOrdered = sc.nextInt();}
			switch(userChoice){
				case 1: 
					System.out.println("You have selected " + qtyOrdered +" nos of item Poha");
					totalCost = totalCost + qtyOrdered * 25;
					itemsOrdered = itemsOrdered + qtyOrdered;
					break;
					
				case 2: 
					System.out.println("You have selected " + qtyOrdered +" nos of item Upma");
					totalCost = totalCost + qtyOrdered * 25;
					itemsOrdered = itemsOrdered + qtyOrdered;
					break;
					
				case 3: 
					System.out.println("You have selected " + qtyOrdered +" nos of item Misal");
					totalCost = totalCost + qtyOrdered * 50;
					itemsOrdered = itemsOrdered + qtyOrdered;
					break;
					
				case 4: 
					System.out.println("You have selected " + qtyOrdered +" nos of item WadaPav");
					totalCost = totalCost + qtyOrdered * 15;
					itemsOrdered = itemsOrdered + qtyOrdered;
					break;
					
				case 5: 
					System.out.println("You have selected " + qtyOrdered +" nos of item Dosa");
					totalCost = totalCost + qtyOrdered * 40;
					itemsOrdered = itemsOrdered + qtyOrdered;
					break;
				
				case 6: 
					System.out.println("You have selected " + qtyOrdered +" nos of item Utappa");
					totalCost = totalCost + qtyOrdered * 40;
					itemsOrdered = itemsOrdered + qtyOrdered;
					break;
					
				case 7: 
					System.out.println("You have selected " + qtyOrdered +" nos of item Idli");
					totalCost = totalCost + qtyOrdered * 40;
					itemsOrdered = itemsOrdered + qtyOrdered;
					break;
					
				case 8: 
					System.out.println("You have selected " + qtyOrdered +" nos of item Medu Vada");
					totalCost = totalCost + qtyOrdered * 40;
					itemsOrdered = itemsOrdered + qtyOrdered;
					break;
					
				case 9: 
					System.out.println("You have selected " + qtyOrdered +" nos of item Sample Wada");
					totalCost = totalCost + qtyOrdered * 50;
					itemsOrdered = itemsOrdered + qtyOrdered;
					break;
					
				case 10: 
					System.out.println("You have ordered " + itemsOrdered +" nos. Your total Cost is " + totalCost);
					bill = true;
					break;					
				
				default:
					System.out.println("Enter the correct choice!!");
			}
		}
		sc.close();
	}
}