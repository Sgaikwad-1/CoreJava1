package com.edubridge.interfacedemo;
/*program to demonstrate on 
 * nested interface*/
public interface Books {
	void showBooks();
	
	interface StoryBooks{
		void showBooks();
	}
}
