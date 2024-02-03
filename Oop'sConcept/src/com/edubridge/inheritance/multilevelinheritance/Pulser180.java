package com.edubridge.inheritance.multilevelinheritance;

public class Pulser180 extends Pulser{

	public int speed;
	public int price;
	
	public Pulser180(int speed, int price ) {
		super(speed,price);
		this.speed=speed;
		this.price=price;
		super.price=200000;
		super.speed=25;
	}

	@Override
	public String toString() {
		return "Pulser180 [speed=" + speed + ", price=" + price + "]";
	}	
}
