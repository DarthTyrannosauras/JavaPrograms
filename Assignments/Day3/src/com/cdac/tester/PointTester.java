package com.cdac.tester;
import java.util.*;
import com.cdac.core.*;

class PointTester{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter x and y coordinates for the point.");
		Point2D point1 = new Point2D(sc.nextInt(), sc.nextInt());
		
		System.out.println("The coordinates of the point are: ");
		System.out.println(point1.show());
		
		System.out.println("Enter x and y coordinates for the point.");
		Point2D point2 = new Point2D(sc.nextInt(), sc.nextInt());
		
		//(point1.isEqual(point2)==true)?System.out.println("Equal points"):System.out.println("Unequal points");
		if(point1.isEqual(point2)==true){
			System.out.println("Equal points");
		}
		else{
			System.out.println("Unequal points");
			System.out.println("The distance between points is " + point1.calculateDistance(point2) );
		}
	}
}