package com.bridgelabz.base.oop1;

public class Rectangle extends Area {

	public Rectangle(double x, double y) {
		super(x, y);
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of Rectangle = "+(this.x * this.y));
	}
}
