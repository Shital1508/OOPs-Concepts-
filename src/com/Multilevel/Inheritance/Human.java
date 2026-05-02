package com.Multilevel.Inheritance;

public class Human {
	String age;
	String name;
	String address;
	
	Human(String age,String name , String address)
	{
		this.age=age;
		this.name=name;
		this.address=address;
	}
	
	void HumanShow()
	{
		System.out.println("Age          :"+ age);
		System.out.println("Name         :" + name);
		System.out.println("Address      :" + address);
	}
	

}
