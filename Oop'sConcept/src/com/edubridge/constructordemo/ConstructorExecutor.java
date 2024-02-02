package com.edubridge.constructordemo;
class Rectangle
{
	//instance variable
	int length;
	int breadth;
	
	//parameterized constructor
	Rectangle(int length, int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	Rectangle(){
		System.out.println("Rectangle");
	}
	void displayAreaPerimeter()
	{
		System.out.println("Area of Rectangle:"
				+length*breadth);
		System.out.println("Perimeter of rectangle"+
				2*(length+breadth));
	}
}

public class ConstructorExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r=new Rectangle(4,5);
		Rectangle r1=new Rectangle(5,8);
		Rectangle r2=new Rectangle();
		r.displayAreaPerimeter();
		r1.displayAreaPerimeter();
		

	}

}
