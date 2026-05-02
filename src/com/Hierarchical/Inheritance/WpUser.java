package com.Hierarchical.Inheritance;

public class WpUser extends User {
	String whatsappNumber;
	
	WpUser(String username,String password,String whatsappNumber)
	{
		super(username,password);
		this.whatsappNumber=whatsappNumber;
	}
	
	void showWpUser()
	{
		System.out.println("**WhatsApp**");
	    showUser();
		System.out.println("Whatsapp Number :" + whatsappNumber);
		System.out.println("-------------------------------");
	}

}
