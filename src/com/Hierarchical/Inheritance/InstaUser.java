package com.Hierarchical.Inheritance;

public class InstaUser extends User {
	String instaId;
	String followers;
	String following;
	
	InstaUser(String username,String password,String instaId,String followers,String following)
	{
		super(username,password);
		this.instaId=instaId;
		this.followers=followers;
		this.following=following;
	}

	void showInstaUser()
	{
		System.out.println("**Instagram**");
		showUser();
		System.out.println("Insta Id :"+instaId);
		System.out.println("Follwers :" +followers);
		System.out.println("Following :" +following);
		System.out.println("------------------------------");
	}

}
