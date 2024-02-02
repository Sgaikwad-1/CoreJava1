package com.edubridge.packone;
/*program to demonstrate on public,
 *private and default acess specifier 
 */
public class AccessSpecifierDemo {
	private int atm_pinNo;
	public String emailId;
	float percentage;
	
	private void displayPinNo()
	{
		System.out.println(atm_pinNo);
	}
	public void displayemailId()
	{
		System.out.println(emailId);
	}
	void displaypercentage()
	{
		System.out.println(percentage);
	}
}
