package com.edubridge.interfacedemo;
//implementable class
public class Learner implements Deletable {
	
	//it provide run time information 
	public boolean delete(Object o)
	{
		if(o instanceof Deletable)
			return true;
		return false;
		
		
	}


}
