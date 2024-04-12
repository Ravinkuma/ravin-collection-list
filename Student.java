package com.collection.assign;

public class Student {
    int rollNumber;
    String name;
    String mobileNumber;
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Student(int rollNumber, String name, String mobileNumber) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.mobileNumber = mobileNumber;
	}
	
    public Student() {
    	
   }
}
