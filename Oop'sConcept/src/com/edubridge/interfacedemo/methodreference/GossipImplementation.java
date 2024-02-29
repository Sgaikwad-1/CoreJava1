package com.edubridge.interfacedemo.methodreference;

public interface GossipImplementation {
	
	//static method
	public static void classroomGossip()
	{
		System.out.println("Implementing a functional interface");
	}
	
	public static void main(String[] args) {
		Gossip g=GossipImplementation::classroomGossip;
		g.talk();
	}

}