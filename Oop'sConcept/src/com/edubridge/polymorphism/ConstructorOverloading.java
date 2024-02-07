package com.edubridge.polymorphism;

class Renault
{
	String carName;
	int noOfSeaters;
	String color;
	String engine;
	float price;
	
	Renault(String carName, String color, int noOfSeaters )
	{
		this.carName=carName;
		this.color=color;
		this.noOfSeaters=noOfSeaters;
		System.out.println(carName+" "+color+" "+noOfSeaters);
	}
	Renault(String carName, String color, float price )
	{
		this.carName=carName;
		this.color=color;
		this.price=price;
		System.out.println(carName+" "+color+" "+price);
		
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Renault r=new Renault("RXE","Yellow",6);
		Renault r1=new Renault("Duster","Red",850000f);
	}
}
