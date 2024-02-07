package com.edubridge.interfacedemo;

import java.util.Scanner;

public class EmployeeCloneableExecutor {

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter empId");
		int empId=s.nextInt();
		System.out.println("Enter empname");
		String empname=s.next();
		System.out.println("Enter Salary");
		long salary=s.nextLong();
		
		Employee e1=new Employee(empId,empname,salary);
		Employee e2=(Employee)e1.clone();
		e2.display();

	}

}
