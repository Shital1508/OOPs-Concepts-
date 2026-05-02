package com.Hierarchical.Inheritance;

public class User {
	String username;
	String password;
	
	User(String username,String password)
	{
		this.username=username;
		this.password=password;
	}
	
	void showUser()
	{
		System.out.println("Username :" +username);
		System.out.println("Password :" +password);
	}

}
