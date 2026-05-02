package com.filehandling;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class Demo {
	public static void main(String []args) throws IOException{
		
//		for(int i=0;i<=100;i++) {
//			File file=new File("C:\\Users\\shita\\Desktop\\Shital\\FileCreating\\emp'"+i+"'.pdf");
//			file.createNewFile();
//			System.out.println("file created");
//		}
		
		File file=new File("C:\\Users\\shita\\Desktop\\Shital\\oop.txt");
		file.createNewFile();
		System.out.println("File created");
		
		
		
//		String id="102   1";
//		String name="Amruta  1";
//		String address="Khadaki1";
		FileWriter fw=new FileWriter("C:\\\\Users\\\\shita\\\\Desktop\\\\Shital\\\\oop.txt");
		
//		int numbers[]= {10,24,53,53,25,54,23};
//		String names[]= {"Shital","Amruta","Tanuja","Tejas","Mauli"};
//		
//		String nums=Arrays.toString(numbers);
//		String n=Arrays.toString(names);
//		
//		fw.write("Numbers:"+nums);
//		fw.write("\nNames  :"+n);
//		
		
		
		
//		fw.write("\nID       :"+id);
//		fw.write("\nName     :"+name);
//		fw.write("\nAddress  :"+address);
//		fw.write("\n------------------------------------");
//		
//		for(int i=0;i<=100;i++)
//		{
////			fw.write("\nHello"+i);
////			int number= (int)(Math.random()*1000000);
////			fw.write("\nRandom number :"+number);
//			fw.write("\nShital");
//		}
//		
//		
		fw.flush();
		System.out.println("Data write");
		

	}
	
	
	

}
