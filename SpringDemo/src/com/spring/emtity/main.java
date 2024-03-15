package com.spring.emtity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class main {
	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		Employee e1=(Employee)context.getBean("emp");
		
		e1.disp();
	}

	
}
