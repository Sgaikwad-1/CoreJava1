package com.edubridge.synchronization;
//Thread 2
public class ThreadTwo extends Thread {
    SynchronizedMethod m1;

	public ThreadTwo(SynchronizedMethod m1) {
		super();
		this.m1 = m1;
	}
	public void run()
	{
		m1.print(10);
	
	}

}
