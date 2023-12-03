/**
 * BoxCreator for creation of Boxes
 */
package com.cdac.core;

public class BoxCreator {
	private double length;
	private double depth;
	private double height;
	
	//Constructor for creating a box
	public BoxCreator(double length, double depth, double height) {
		this.length=length;
		this.depth=depth;
		this.height=height;
	}
	
	//Constructor for creating a cube box
	public BoxCreator(double side) {
		this(side,side,side);
	}
	
	//Method for displaying Dimensions
	public String displayDimensions() {
		return "Length: "+this.length+", Depth: "+this.depth+", Height: "+this.height;
	}
	
	//Method for calculating volume of box
	public double calculateVolume() {
		return this.depth*this.height*this.length;
	}
	
	//Method for checking if box1==box2
	public boolean isEqual(BoxCreator box2) {
		if(this.length != box2.length) {return false;}
		if(this.depth != box2.depth) {return false;}
		if(this.height != box2.height) {return false;}
		return true;
	}
	
	//Method for creating new box with offset
	public BoxCreator newBoxWithOffset(double offsetLength, double offsetDepth, double offsetHeight) {
		BoxCreator box2=new BoxCreator(this.length + offsetLength, this.depth + offsetDepth, this.height+offsetHeight);
		return box2;
	}

}
