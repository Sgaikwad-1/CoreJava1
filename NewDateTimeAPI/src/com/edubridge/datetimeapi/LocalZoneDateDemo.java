package com.edubridge.datetimeapi;
import java.time.*;


public class LocalZoneDateDemo {

	public static void main(String[] args) {
		ZonedDateTime z=ZonedDateTime.now();
		System.out.println(z);
		
		OffsetTime o=OffsetTime.now();
		System.out.println(o);
		
		ZoneId i=ZoneId.of("Asia/Calculta");
		System.out.println(i);
		
		ZoneOffset z1=ZoneOffset.ofHoursMinutes(12, 20);
		System.out.println(z1);
		
	   
		
	}

}