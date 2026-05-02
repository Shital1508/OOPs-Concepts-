package com.Hierarchical.Inheritance;

public class WbUser extends User {
	
	String follwers;
	
	WbUser(String username,String password,String follwers)
	{
		super(username,password);
		this.follwers=follwers;
	}
	
	void showWbUser()
	{
		System.out.println("**WB**");
		showUser();
		System.out.println("Follwers :" +follwers);
		System.out.println("-------------------------");
	}

}
