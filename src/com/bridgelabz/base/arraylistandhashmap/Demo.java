package com.bridgelabz.base.arraylistandhashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
	private String fname;
	private String lname;
	public Student(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	@Override
	public String toString() {
		return "Student [fname=" + fname + ", lname=" + lname + "]";
	}
	public String getFname() {
		return fname;
	}
	public String getLname() {
		return lname;
	}
	 
}

class Address{
	private String street;
	private String landmark;
	private int pincode;
	public Address(String street, String landmark, int pincode) {
		super();
		this.street = street;
		this.landmark = landmark;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", landmark=" + landmark + ", pincode=" + pincode + "]";
	}
	
}
public class Demo {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		List<String> strings2 = new ArrayList<String>();
		
		List<Student> students = new ArrayList<Student>();
		
		students.add(new Student("Shubham1", "Chavan1"));
		students.add(new Student("Shubham2", "Chavan2"));
		students.add(new Student("Shubham3", "Chavan3"));
		students.add(new Student("Shubham4", "Chavan4"));
		students.add(new Student("Shubham5", "Chavan5"));
		
		strings2.add("Shubham11");
		strings2.add("Shubham22");
		strings2.add("Shubham33");
		strings2.add("Shubham44");
		strings2.add("Shubham55");
		
		strings.add("Shubham1");
		strings.add("Shubham2");
		strings.add("Shubham3");
		strings.add("Shubham4");
		strings.addAll(3,strings2);
		strings.add("Shubham5");
		strings.add("Shubham6");
		strings.add("Shubham7");
		
		System.out.println(strings);
		
		System.out.println(strings.contains("Shubham5"));
		
		for(int i = 0 ;i< strings.size(); i++) {
			System.out.println(strings.get(i));
		}
		
		strings.remove("Shubham1");
		System.out.println(strings.size());
		for(int i = 0 ;i< strings.size(); i++) {
			System.out.println(strings.get(i));
		}
		
		for(int i = 0 ;i< students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		Map<String, Address> map = new HashMap<String, Address>();
		
		for(int i = 0 ;i< students.size(); i++) {
			map.put(students.get(i).getFname(), new Address("At Post Nagpur"+(i+1), "Nagpur Station"+(i+1),400000+i));
		}
		
		map.put("Shubham3", new Address("At Post Nagpur11", "Nagpur Station11",400011));
		System.out.println(map);
		System.out.println(map.get("Shubham3"));
		
		List<Integer> integers = Arrays.asList(1,2,4,5,6,7);
		
		System.out.println(integers);
		
		integers.add(45);
		
		System.out.println(integers);
	}
}
