package com.edubridge.interfacedemo.methodreference;

public class LearnerImpIementation {
	
	public void learnerMockito()
	{
		System.out.println("Mockito with Junit-5");
	}
	public static void main(String[] args) {
		//reference to a instance method
		LearnerImpIementation l1=new LearnerImpIementation();
		Learner l=l1::learnerMockito;
		
		l.learn();
		
		
	}

}
