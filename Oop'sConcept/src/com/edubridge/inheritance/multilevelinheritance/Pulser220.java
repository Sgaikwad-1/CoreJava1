package com.edubridge.inheritance.multilevelinheritance;

public class Pulser220 extends Pulser180 {
	public int speed;
	public int price;
	public Pulser220(int speed, int price ) {
		super(speed,price);
		this.speed=speed;
		this.price=price;
		
		super.price=200000;
		super.speed=25;

}

	@Override
	public String toString() {
		return "Pulser220 [speed=" + speed + ", price=" + price + ", toString()=" + super.toString() + "]";
	}
}