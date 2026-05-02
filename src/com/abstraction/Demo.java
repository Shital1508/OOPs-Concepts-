package com.abstraction;

public class Demo extends Student {
      
	void pay()
	{
		System.out.println("pay method");
	}
	
	void resister()
	{
		System.out.println("Resister method");
	}
	
	void work()
	{
		System.out.println("Work method");
		
	}
	
	public static void main (String [] args) {
		Demo demo = new Demo();
		demo.pay();
		demo.resister();
		demo.work();
	}
}
