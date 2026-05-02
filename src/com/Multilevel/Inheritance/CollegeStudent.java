package com.Multilevel.Inheritance;

public class CollegeStudent extends Student{
	String collegeName;
	
	CollegeStudent(String age,String name , String address,String studentId,String collegeName)
	{
		super(age,name,address,studentId);
		this.collegeName=collegeName;
	}
	
	void collegeStudentShow()
	{
		System.out.println("College Name :" +collegeName);
	}
	

}
