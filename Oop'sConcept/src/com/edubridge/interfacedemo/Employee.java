package com.edubridge.interfacedemo;
import java.util.*;
/*program to demonstrate on Clone able 
 * built in marker interface*/

/*if we are not implementing clone able interface
 * and if we are invoking the clone method in the 
 * driver class,we will get an exception as
 * "ClassNotSupportedException*/
public class Employee implements Cloneable{
	
	public int empId;
	public String empname;
	public long salary;
	
	//constructor
	public Employee(int empId, String empname, long salary) {
		super();
		this.empId = empId;
		this.empname = empname;
		this.salary = salary;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	void display()
	{
		System.out.println("Emp Id:"+empId);
		System.out.println("Emp Name:"+empname);
		System.out.println("Emp Salary:"+salary);
	}
	

}
