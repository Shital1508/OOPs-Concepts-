package com.filehandling;
import java.io.FileReader;

public class FileOperations {
	
	static public void readFileData()
	{
		try
		{
			FileReader fr=new FileReader("C:\\Users\\shita\\Desktop\\Shital\\Core Java\\Exceptions Handlings.txt");
			int data;
			while((data=fr.read())!=-1)
			{
				System.out.print((char)data);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String [] args) {
		readFileData();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	static public void readFileData()
//	{
//		try
//		{
//			FileReader fr=new FileReader("C:\\Users\\shita\\Desktop\\Shital\\Core Java\\Interfaces.txt");
//			int data;
//			while((data=fr.read())!=-1)
//			{
//				System.out.print((char)data);
//			}
//		}
//		catch(Exception e){
//			{
//				System.out.println(e.getMessage());
//			}
//		}
//	}
//	
//	public static void main(String [] args) {
//		readFileData();
//	}
	
	
	
	
	
//	static public void readFileData ()
//	{
//		try
//		{
//			FileReader fr=new FileReader("C:\\Users\\shita\\Desktop\\Shital\\Core Java\\File Handling.txt");
//			int data;
//			while((data=fr.read())!=-1)
//			{
//				System.out.print((char)data);
//			}
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
//	
//	public static void main(String [] args) {
//		readFileData();
//	}
	
	
	
	
//	static public void fileReader()
//	{
//		try
//		{
//			FileReader fr=new FileReader("C:\\Users\\shita\\Desktop\\Shital\\Employee.txt");
//			int data;
//			while((data=fr.read())!=-1)
//			{
//				System.out.print((char)data);
//			}
//		}catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//	}
//	
//	public static void main(String [] args) {
//		fileReader();
//	}
//	
//	
//		
//	
////	void fileReader()
////	{
////		try 
////		{
////			FileReader fr=new FileReader("C:\\Users\\shita\\Desktop\\Shital\\Core Java\\Encapsulation.txt");
////			fr.read();
//			int data;
//			while((data=fr.read()) != -1)
//			{
//				
//			}
//		}
//		catch(Exception e)
//		{
//			System.out.println(e.getMessage());
//		}
//	}
//	
//
  }
