package com.edubridge.structural;

public class FranchiseRegistration 
{
	Franchise KFC;
	Franchise McDonalds;
	Franchise Dominos;
	
public FranchiseRegistration() 
{
	KFC = new KFC();
	McDonalds = new McDonals();
	Dominos = new Dominos();
}


public void BuyKFC()
{
	KFC.option();
	KFC.cost();
}
public void BuyMcDonals()
{
	McDonalds.option();
	McDonalds.cost();
}
public void BuyDominos()
{
	McDonalds.option();
	McDonalds.cost();
}
}