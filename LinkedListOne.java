package com.linkedList.one;

import java.util.LinkedList;
import java.util.List;

public class LinkedListOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> mobileNumOfStudents=new LinkedList<>();
		mobileNumOfStudents.add("9922115544");
		mobileNumOfStudents.add("9822115544");
		mobileNumOfStudents.add("9722115544");
		mobileNumOfStudents.add("9622115544");
		mobileNumOfStudents.add("9522115544");
		mobileNumOfStudents.add("9422115544");
		mobileNumOfStudents.add("9322115544");
		mobileNumOfStudents.add("9222115544");
		mobileNumOfStudents.add("9122115544");
		mobileNumOfStudents.add("9022115544");
		System.out.println("list of mobile number of 10 students is below: ");
		for(String s: mobileNumOfStudents) {
			System.out.println(s);
		}
		
		

	}

}
