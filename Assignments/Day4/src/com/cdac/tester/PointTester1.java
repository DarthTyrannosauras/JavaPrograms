/**
 * 
 */
package com.cdac.tester;

import java.util.Scanner;
import com.cdac.core.Point2D;

public class PointTester1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creation of array
		System.out.println("Enter the #elements of the array");
		Point2D[] points = new Point2D[sc.nextInt()];
		
		//Condition for running loop
		boolean exitProgram = false;
		while (!exitProgram) {
			System.out.println("Enter the choice:\n1:Insert\n2:Display\n3:CheckEqual\n4:Exit");
			int userChoice = sc.nextInt();
			switch (userChoice) {
			case 1:
				//Get index from user
				System.out.println("Enter index where point to be inserted: ");
				int userIndex = sc.nextInt();
				
				//Check if out of bounds
				if (userIndex < points.length && userIndex >= 0) {
					//Accept points if not present at the index.
					if (points[userIndex] == null) {
						System.out.println("Enter the co-ordinates of the point.");
						points[userIndex] = new Point2D(sc.nextDouble(), sc.nextDouble());
						System.out.println(points[userIndex].show());
					} else
						System.out.println("Point already exists. Kindly enter new index.");
				} else
					System.out.println("The index is out of bounds. Enter an index from 0 to " + (points.length - 1));
				break;

			case 2:
				int count = 0;
				//For each loop for looping through array
				for (Point2D i : points) {
					//Display point if created
					if (points[count] != null) {
						System.out.println("The point at index " + (count++) + " is: " + i.show());
					} else
						count++;
				}
				break;

			case 3:
				//Fetch 2 points from the user
				System.out.println("Insert 2 indices to fetch points from:");
				int index1 = sc.nextInt();
				int index2 = sc.nextInt();
				
				//If points are equal, dist=0; else display distance
				if (points[index1].isEqual(points[index2])) {
					System.out.println("Points are equal.");
					System.out.println("The distance between them is zero.");
				} else {
					System.out.println("Points are not equal.");
					System.out.println(
							"The distance between points is: " + points[index1].calculateDistance(points[index2]));
				}
				break;

			case 4:
				//Exiting the loop
				exitProgram = true;
				System.out.println("Exiting program...");
				break;

			default:
				System.out.println("Kindly enter correct choice.");
			}
		}
		// Closing scanner
		sc.close();
	}
}
