package com.edubridge.oopsguestlec;
class Employee{
	String empName;
	int age;
	//constructor overloading
	 Employee() {
		System.out.println("This is default constructor");
	}
	 Employee(String empName,int age){
		 empName=empName;
		 age=age;
		 System.out.println(empName+" "+age);
	 }
}
public class DemoB {
	public static void main(String[] args) {
		Employee e1=new Employee();
        Employee e2=new Employee("jhon",22);
	}
}
