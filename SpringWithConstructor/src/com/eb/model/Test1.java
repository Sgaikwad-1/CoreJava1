package com.eb.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test1 {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		
		Patient p1=(Patient)context.getBean("pat");
		
		p1.disp();
	}


}
 