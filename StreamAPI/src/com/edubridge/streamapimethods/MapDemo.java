package com.edubridge.streamapimethods;

import java.util.Arrays;
import java.util.List;

public class MapDemo {

	public static void main(String[] args) {
		List<String>obj=Arrays.asList("shifa","snehal","preeti");
		obj.stream().map(i->i.toUpperCase()).
		forEach(i->System.out.println(i+" "));
	}
}
