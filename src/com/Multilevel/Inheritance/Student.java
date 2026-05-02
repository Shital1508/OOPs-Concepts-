package com.Multilevel.Inheritance;

public class Student extends Human {
	String studentId;
	
	Student(String age,String name , String address,String studentId)
	{
		super(age,name,address);
		this.studentId=studentId;
	}
	
	void StudentShow()
	{
		System.out.println("Student ID   :" +studentId);
	}
	

}
