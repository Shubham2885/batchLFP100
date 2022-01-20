package com.bridgelabz.base.oop1;

public class Area {

	protected double x;
	protected double y;
	private String name;
	
	public Area() {
		
	}
	
	public Area(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Area(double x, double y, String name) {
		super();
		this.x = x;
		this.y = y;
		this.name = name;
	}
	
	public void calculateArea() {
		System.out.println("Area = "+(x+y));
	}
	
}
