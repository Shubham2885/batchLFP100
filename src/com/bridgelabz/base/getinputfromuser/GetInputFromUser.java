package com.bridgelabz.base.getinputfromuser;

import java.util.Scanner;

public class GetInputFromUser {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		
//		System.out.println("Enter the Name");
//		String name = scanner.nextLine();
//		
//		System.out.println("My Name is "+name);
//		
		GetInputFromUser fromUser = new GetInputFromUser();
//		fromUser.printMyAddress();
		
//		System.out.println("Enter the number");
//		int number = scanner.nextInt();
//		fromUser.findEvenOrOdd(number);
		
		System.out.println("Enter the charecter");
		char ch = scanner.next().charAt(0);
		System.out.println("Charecter is "+ch);
		System.out.println("ASCII value = "+(int)ch);
	}
	
	public void printMyAddress() {
		String address = scanner.next();
		System.out.println("Address = "+address);
	}
	
	public void findEvenOrOdd(int number) {
		if(number % 2 == 0) {
			System.out.println("Given Number is even");
		}else {
			System.out.println("Given Number is odd");
		}
	}
}
