package com.edubridge.inheritance.multilevelinheritance;
/*program to demonstrate on multilevel inheritance*/
//parent class1
public class Pulser {
	
	public int speed;
	public int price;
	
	public Pulser(int speed, int price) {
		super();
		this.speed = speed;
		this.price = price;
	}
	public String toString() {
		return "Pulser [speed=" + speed + ", price=" + price + "]";
	}
}
