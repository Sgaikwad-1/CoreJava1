package com.edubridge.inheritancehierchicalinheritance;

public class HierchicalInheritanceExecutor {
	public static void main(String[] args) {
		Tiramisu t=new Tiramisu();
		SnowCone s=new SnowCone();
		t.deviceName="Realme 10 pro";
		t.version="Android 13";
		s.deviceName="Samsung";
		s.version="Android 12";
		t.print();
		s.print();
	}
}
