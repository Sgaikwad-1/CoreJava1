package com.edubridge.classandobjectdemo;
//program to demonstrate on class and object
class Vegetable
{
	//variable or field
	String vegetableName;
	int price;
	
	//methods
	void print()
	{
		System.out.println("Vegetable Name"
	+vegetableName+" "+"Price"+price);
	}
	
}


public class ClassAndObjectExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vegetable v=new Vegetable();
		v.vegetableName="JackFruit";
		v.price=10;
		v.print();

	}

}
