package com.poly;

public class Student {
	//Compile time polymorphism
	void study(int w, String s)
	{
		System.out.println("Study on laptop");
	}
	
	void study( String s,int w)
	{
		System.out.println("Study on Notebook");
	}
    
	public static void main (String [] args) {
		Student s = new Student();
		s.study(10,"Shital");
		s.study("Shital",10);
	}

}
