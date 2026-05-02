package com.poly;

public class Son extends Father {
	String bankBalance= "1 CORORE";
	
	void bankBalance()
	{
		System.out.println(bankBalance);
	}
	
	void login()
	{
		String otp="1234";
		
		if(otp.equals("1234"))
		{
			System.out.println("Login Success");
		}
		else
		{
			System.out.println("Login Failed");
		}
	}
	
	public static void main (String [] args) {
//		Father f = new Father();
//		f.bankBalance();
//		f.login();
		
		Son son=new Son();
		son.bankBalance();
		son.login();
		
	}

}
