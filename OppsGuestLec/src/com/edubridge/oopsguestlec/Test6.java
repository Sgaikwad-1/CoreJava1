package com.edubridge.oopsguestlec;
abstract class Orders{
	public void show() {
		System.out.println("This is show method");
	}
}
class Demo extends Orders{
	
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo o1=new Demo();
		o1.show();

	}

}
