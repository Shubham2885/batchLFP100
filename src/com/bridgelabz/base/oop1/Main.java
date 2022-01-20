package com.bridgelabz.base.oop1;

public class Main {

	public static void main(String[] args) {
		Area area = new Rectangle(4.5,2.0);
		area.calculateArea();
		
		Area triangle = new Triangle(4.5,2.0);
		triangle.calculateArea();
	}
}
