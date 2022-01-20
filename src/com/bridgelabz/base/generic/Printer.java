package com.bridgelabz.base.generic;

public class Printer {

//	public void print(String x) {
//		System.out.println(x);
//	}
//	
//	public void print(int x) {
//		System.out.println(x);
//	}
//	
//	public void print(double x) {
//		System.out.println(x);
//	}
//	
//	public void print(boolean x) {
//		System.out.println(x);
//	}
//	
//	public void print(float x) {
//		System.out.println(x);
//	}
//	
//	public void print(Student x) {
//		System.out.println(x);
//	}
	
	public <T> void print(T x) {
		System.out.println(x);
	}
}
