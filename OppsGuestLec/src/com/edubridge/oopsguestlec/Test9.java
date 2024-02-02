package com.edubridge.oopsguestlec;
class Student{

	String name;

	

	Student(String name){

	this.name=name;

	}

	void disp() {

		System.out.println(name);

	}

}

public class Test9 {

 

	public static void main(String[] args) {

		Student s1=new Student("jhon");

		s1.disp();

		

	}

 

}
