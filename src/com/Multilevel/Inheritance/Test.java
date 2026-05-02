package com.Multilevel.Inheritance;

public class Test {
	public static void main (String [] args) {
		CollegeStudent clg = new CollegeStudent("20","Shital Babar","Pune","7404","BVCOEW");
		clg.HumanShow();
		clg.StudentShow();
		clg.collegeStudentShow();
		
		System.out.println("----------------------------------");
		
		CollegeStudent clg1 = new CollegeStudent("19","Amruta Shinde","Khadaki","7403","YCM");
		clg1.HumanShow();
		clg1.StudentShow();
		clg1.collegeStudentShow();
		
	}

}
