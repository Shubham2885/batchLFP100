package com.bridgelabz.base.oop1;

public class Triangle extends Area {

	public Triangle(double x, double y) {
		super(x, y);
	}
	
	@Override
	public void calculateArea() {
		System.out.println("Area of Triangle = "+((0.5)*this.x*this.y));
	}
}
