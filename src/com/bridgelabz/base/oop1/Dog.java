package com.bridgelabz.base.oop1;

//single inheritance
public class Dog extends Animal {

	public void bark() {
		System.out.println("Dog can bark");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.eat();
		dog.sleep();
	}
}
