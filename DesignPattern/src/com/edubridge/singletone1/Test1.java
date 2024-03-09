package com.edubridge.singletone1;

class BOI implements Plan{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		
		System.out.println("The rate of Interest for BOI"+rate+"%");
		
	}
	
}

class SBI implements Plan{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		
		System.out.println("The rate of Interest for SBI:"+rate+"%");
		
	}
	
}
class BOB implements Plan{

	@Override
	public void getRoi(double rate) {
		// TODO Auto-generated method stub
		
		System.out.println("The rate of Interest for BOB:"+rate+"%");
		
	}
	
}
public class Test1 {
	
	

	public static void main(String[] args) {
		BOI b1=new BOI();
		b1.getRoi(8.9);
		SBI s1=new SBI();
		s1.getRoi(5.9);
		BOB b2=new BOB();
		b2.getRoi(8.2);
		

	}

}
