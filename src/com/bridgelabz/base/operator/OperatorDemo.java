package com.bridgelabz.base.operator;

public class OperatorDemo {

	public static void main(String[] args) {
		int x = 55;
		int y = 10;
		int z = 60;
		// arithmatic op
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		
		// relational op
		if(x > y) {
			System.out.println("x is greater");
		}else {
			System.out.println("y is greater");
		}
		
		System.out.println(x!=y);
		System.out.println(x == y);
		
		
		//logical op
		if(x > y && x > z) {
			System.out.println("X is greater");
		}else if(y > x && y > z) {
			System.out.println("Y is greater");
		}else {
			System.out.println("Z is greater");
		}
		
		// Ternary
		System.out.println("Using Ternary = "+ (x > y ? "X is greater" : "Y is greater"));
		
		System.out.println("Using Ternar for 3 comparision = "+(x >y && x > z ? "X is greater" : y > x && y > z ? "Y is greater" : "Z is greater"));
		
		// assignemnt op
		// x = x + 10
		x += 10;
		System.out.println(x);
		
		//Unery op
		int  a = 10;
		System.out.println(~a);
		System.out.println(a);
		// postfix increment
		a++;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		// prefix increment
		++a;
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println(a);
		// postfix decrement
		a--;
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		// prefix decrement
		--a;
		System.out.println(a);
		System.out.println(--a);
		System.out.println(a);
		
		
	}
}
