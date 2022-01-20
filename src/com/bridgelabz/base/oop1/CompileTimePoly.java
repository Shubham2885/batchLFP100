package com.bridgelabz.base.oop1;

import java.util.Scanner;

// compile time poly also called as method overloading is total besed on no of parameters or different dataypes
public class CompileTimePoly {

	public static void print(String pdf) {
		System.out.println("printing pdf");
	}
	
//	public String print(String pdf) {
//		System.out.println("printing pdf");
//		return "abc";
//	}
	
	public static void print(Integer xlxs) {
		System.out.println("printing xlxs");
	}
	
	public static void print(double photos, int numberOfprint) {
		System.out.println("Pring photos of copies "+numberOfprint);
	}
	
	public static void main(String[] args) {
		print("sdf");
		Scanner scanner = new Scanner(System.in);
	}
}
