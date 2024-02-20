package com.edubridge.datetimeapi;
//program to demonstrate on LocalDate, LocalTime, LocalDateTime
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		System.out.println("The current Date:"+d);
		
		LocalTime t=LocalTime.now();
		System.out.println("The current Time:"+t);
		
		LocalDateTime l=LocalDateTime.now();
		System.out.println("The current DateTime :"+l);
	}
}
