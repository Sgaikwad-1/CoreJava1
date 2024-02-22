package com.edubridge.synchronization;

public class MyThread extends Thread {
	Welcome w;

	public MyThread(Welcome w) {
		super();
		this.w = w;
	}
	public void run()
	{
		//to access static method use ClassName.methodname();
		Welcome.display(getName());
	}



}
