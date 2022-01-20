package com.bridgelabz.base.generic;

public class Comparision <T extends Comparable<T>>{

	private T x;
	private T y;
	
	public Comparision(T x, T y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	public T getY() {
		return y;
	}

	public <T> void compareTo() {
		System.out.println(this.x.compareTo(this.y));
	}
}
