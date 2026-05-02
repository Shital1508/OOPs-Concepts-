package com.shyam;
import com.ram.Student;
public class Teacher  {
	
	
	public void login()
	{
		System.out.println("Login");
	}
	
	public static void main (String [] args) {
		Teacher t=new Teacher();
		t.login();
		
		
		Student s=new Student();
//		s.id=34;// we can not assign id value because 
		
		System.out.println(s.id);
	}

}
