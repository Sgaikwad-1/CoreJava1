package com.edubridge.oopsguestlec;

class Dog{
	String color="black";
}
class Cat extends Dog{
	String color1="White";
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1=new Cat();
		System.out.println("Cat Color is: "+c1.color1+"\nDog Color"
				+ " is: "+c1.color);

	}

}
