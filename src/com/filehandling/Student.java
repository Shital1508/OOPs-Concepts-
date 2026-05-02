package com.filehandling;
import java.io.File;
import java.io.FileWriter;

public class Student {
	int id;
	String name;
	String password;
	String email;
	
	Student(int id,String name,String password,String email )
	{
		this.id=id;
		this.name=name;
		this.password=password;
		this.email=email;
	}
	
	public static void main(String [] args) throws Exception{
		Student s=new Student(101,"Shital","Shital@123","shital@gmail.com");
		Student s1=new Student(102,"Amruta","Amruta@123","amruta@gmail.com");
		Student s2=new Student(103,"Tanuja","Tanuja@123","tanuja@gmail.com");
		Student s3=new Student(104,"Mauli","Mauli@123","mauli@gmsil.com");
		
		File file=new File("C:\\Users\\shita\\Desktop\\Shital\\student.txt");
		file.createNewFile();
		System.out.println("file created");
		
		FileWriter fw=new FileWriter("C:\\\\Users\\\\shita\\\\Desktop\\\\Shital\\\\student.txt");
		fw.write("\nID      :"+s.id);
		fw.write("\nName    :"+s.name);
		fw.write("\nPassword:"+s.password);
		fw.write("\nEmail   :"+s.email);
		fw.write("\n----------------------------------------");
		
		fw.write("\nID      :"+s1.id);
		fw.write("\nName    :"+s1.name);
		fw.write("\nPassword:"+s1.password);
		fw.write("\nEmail   :"+s1.email);
		fw.write("\n----------------------------------------");
		
		fw.write("\nID      :"+s2.id);
		fw.write("\nName    :"+s2.name);
		fw.write("\nPassword:"+s2.password);
		fw.write("\nEmail   :"+s2.email);
		fw.write("\n----------------------------------------");
		
		fw.write("\nID      :"+s3.id);
		fw.write("\nName    :"+s3.name);
		fw.write("\nPassword:"+s3.password);
		fw.write("\nEmail   :"+s3.email);
		fw.write("\n----------------------------------------");
		
		
		
		fw.flush();
		System.out.println("data write");
	}

}
