package com.cdac.tester;
/*
 * For checking basic functionality of BoxCreator
 * */


import java.util.Scanner;

import com.cdac.core.BoxCreator;
public class TestBox {

	public static void main(String[] args) {
		// creating Boxes
		System.out.println("Welcome to box creation!!");
		Scanner sc = new Scanner(System.in);
		
		//Creating a new cuboid
		System.out.println("Enter the dimensions of the box in order: l,d,h.");
		BoxCreator box1 = new BoxCreator(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println("The dimensions of box are: " + box1.displayDimensions());
		
		//Creating a new cube
		System.out.println("Enter the side of the cube.");
		BoxCreator box2 = new BoxCreator(sc.nextDouble());
		System.out.println("The dimensions of box are: " + box2.displayDimensions());
		
		//Checking if equal:
		System.out.println("Are the boxes Equal?: " + box1.isEqual(box2));
		
		//Displaying volumes:
		System.out.println("Volume of first box is: " + box1.calculateVolume());
		System.out.println("Volume of first box is: " + box2.calculateVolume());
		
		//Creating a new box with offsets
		System.out.println("Enter the offset values for length, depth and height for creation of a new box wrt first box:");
		BoxCreator box3 = box1.newBoxWithOffset(sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.println("The dimensions of box are: " + box3.displayDimensions());
		
		//Closing the scanner
		sc.close();
	}

}
