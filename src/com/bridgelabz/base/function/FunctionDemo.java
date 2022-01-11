package com.bridgelabz.base.function;

class Student {
	private String fName;
	private String lName;
	private long mobileNo;
	private String street;
	private int pinCode;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	
}
public class FunctionDemo {

	/*
	 * return type funtionName(data_type param1,data_type param2...){
	 * 	// statements
	 * }
	 */
	
	//not take paramenters and not return anything
	public void printMyName() {
		System.out.println("printMyName");
	}
	
	//not take paramenters and return anything
	public double getPIValue() {
		return 3.142;
	}
	
	//it takes paramenters and not return anything
	public void printMyFullName(String firstName, String midName, String lName, long mobileNo, String address) {
		System.out.println(firstName+" "+midName+" "+lName+ " \nMobileNo : "+mobileNo+" \nAddress :"+address);
	}
	
	//it takes paramentes and return anything
	public Double addTwoNumbers(Double x, Double y) {
		return x + y;
	}
	
	public void printStudentDetails(Student student) {
		System.out.println("FirstNane = "+student.getfName());
		System.out.println("LastName = "+student.getlName());
		System.out.println("MobileNo = "+student.getMobileNo());
		System.out.println("Street = "+student.getStreet());
		System.out.println("pin code = "+student.getPinCode());
	}
	
	public Student getStudentDetails() {
		Student student =  new Student();
		student.setfName("Rahul");
		student.setlName("Mane");
		student.setMobileNo(2342342);
		student.setStreet("At Post Mumbai");
		student.setPinCode(123456);
		return student;
	}
	
	public static void main(String[] args) {
		FunctionDemo demo = new FunctionDemo();
		
		//call the function
		demo.printMyName();
		
		double radius = 5;
		
		double area = demo.getPIValue() * radius * radius;
		
		System.out.println("Area of Circle is  = "+ area);
		
		demo.printMyFullName("Shubham", "M", "Chavan", 787878787, "Nagpur");
		
		System.out.println("Addition = "+demo.addTwoNumbers(Double.valueOf(5), Double.valueOf(10.5)));
		
		demo.printStudentDetails(demo.getStudentDetails());
	}
}
