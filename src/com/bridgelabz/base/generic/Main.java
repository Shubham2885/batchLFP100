package com.bridgelabz.base.generic;

public class Main {

	public static void main(String[] args) {
		Printer printer= new Printer();
		printer.print(234.4);
		printer.print("sdfsdf");
		printer.print(1234);
		Student student = new Student("SHubham");
		printer.print(student);
		
		Comparision<Integer> comparision = new Comparision<Integer>(15, 67);
		comparision.compareTo();
	}
}
