package com.encapsulation;

public class Demo {
	public static void main(String [] args) {
		Employee e=new Employee();
		
		//set values
		e.setId("101");
		e.setName("Shital Babar");
		e.setSalary("50000");
		e.setDepartment("Information Technology");
		e.setGender("female");
		e.setAddress("Pune");
		
		
		//get values
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getDepartment());
		System.out.println(e.getGender());
		System.out.println(e.getAddress());
	}

}
