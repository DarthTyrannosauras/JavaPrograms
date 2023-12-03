package com.cdac.core;


public class Point2D{
	private double x;
	private double y;
	
	public Point2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public String show(){
		return "x= " + this.x + ", y= " + this.y;
	}
	
	public boolean isEqual(Point2D point2){
		if (this.x != point2.x){return false;}
		if (this.y != point2.y){return false;}
		return true;
	}
	
	
	//Added Override method on 11/10/22
	@Override
	public boolean equals(Object obj2) {
		if(obj2 instanceof Point2D) {
			Point2D point2 = (Point2D)obj2;
			if(x!=point2.x) {return false;}
			if(y!=point2.y) {return false;}
			return true;
		}
		return false;
	}
	
	public double calculateDistance(Point2D point2){
		return Math.sqrt( Math.pow((this.x - point2.x),2) + Math.pow((this.y - point2.y),2) );
	}
	
}