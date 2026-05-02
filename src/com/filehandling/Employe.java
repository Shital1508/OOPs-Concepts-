package com.filehandling;
import java.io.File;
import java.io.FileWriter;

public class Employe {
	String name;
	String id;
	String email;
	String password;
	String salary;
	
	Employe(String name,String id,String email,String password,String salary)
	{
		this.name=name;
		this.id=id;
		this.email=email;
		this.password=password;
		this.salary=salary;
	}
	
	public static void main(String [] args) throws Exception {
		//Objects
		Employe e1=new Employe("Shital","101","shital@gmail.com","Shital@123","500000");
		Employe e2=new Employe("Amruta","102","amruta@gmail.com","Amruta@123","600000");
		
		//new file creating
		File file=new File("C:\\Users\\shita\\Desktop\\Shital\\Employee.txt");
		file.createNewFile();
		System.out.println("File created");
		
		//In new file write a data or information
		FileWriter fw=new FileWriter("C:\\\\Users\\\\shita\\\\Desktop\\\\Shital\\\\Employee.txt");
		fw.write("\nEmployee Name      :"+e1.name);
		fw.write("\nEmployee ID        :"+e1.id);
		fw.write("\nEmployee Email     :"+e1.email);
		fw.write("\nEmployee Password  :"+e1.password);
		fw.write("\nEmployee Salary    :"+e1.salary);
		fw.write("\n-----------------------------------------------------------------------------------");
		fw.flush();
		
		fw.write("\nEmployee Name      :"+e2.name);
		fw.write("\nEmployee ID        :"+e2.id);
		fw.write("\nEmployee Email     :"+e2.email);
		fw.write("\nEmployee Password  :"+e2.password);
		fw.write("\nEmployee Salary    :"+e2.salary);
		fw.write("\n-----------------------------------------------------------------------------------");
		fw.flush();
	}

}
