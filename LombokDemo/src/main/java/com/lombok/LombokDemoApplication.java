package com.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lombok.entity.Menu;

@SpringBootApplication
public class LombokDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokDemoApplication.class, args);
	Menu m1=new Menu();
	
	Menu m2=new Menu(101,"idli",30,2);
	Menu m3=new Menu(101,"Veg Biryani",300,2);
	
	System.out.println(m2.toString());
	System.out.println(m3.toString());
	}

}
