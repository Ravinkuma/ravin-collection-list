package com.inkedList.Two;

import java.util.LinkedList;
import java.util.List;

public class MainEmployees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employees> empList=new LinkedList<>();
		Employees e1=new Employees(201,"Sumit",55000.00);
		Employees e2=new Employees(202,"Amit",55500.00);
		Employees e3=new Employees(203,"Dhoni",59000.00);
		Employees e4=new Employees(204,"Raina",54000.00);
		Employees e5=new Employees(205,"Rohit",57000.00);
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		System.out.println("employees details:");
		for(Employees e: empList) {
			System.out.println("id: "+e.getEmpId()+", name: "+e.getEmpName()+", salary: "+e.getEmpSalary());
		}
        for(Employees e: empList) {
        	if(e.getEmpSalary()>55000) {
        		System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getEmpSalary());
        	}
        }
	}

}
