package com.abstraction;

public class Upi extends Bank {
	void pay(double amount)
	{
		System.out.println("Payment using UPI" + amount);
	}
 
	public static void main (String [] args) {
//		Upi upi = new Upi();
//		upi.pay(35214);
		
		Bank sbi = new SBI();
		sbi.pay(22656);
		
		Bank upi = new Upi();
		upi.pay(25621);
	}
}
