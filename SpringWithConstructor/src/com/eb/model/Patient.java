package com.eb.model;

public class Patient {
	private int pId;
	private String pName;
	private String pDisease;
	


	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Patient(int pId, String pName, String pDisease) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pDisease = pDisease;
	}



	public void disp() {
		System.out.println(pId);
		System.out.println(pName);
		System.out.println(pDisease);
	}

}
