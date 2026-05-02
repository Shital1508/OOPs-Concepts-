package com.poly;

public class Father {
	//Run time polymorphism 
	
	String bankBalance= "1 Lakh";
	
	void bankBalance()
	{
		System.out.println(bankBalance);
	}

	void login()
	{
		String username= "Shital";
		String password= "1234";
		
		if(username.equals("Shital") && password.equals("1234"))
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}
	
}
