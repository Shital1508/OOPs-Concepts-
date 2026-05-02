package com.encapsulation;

public class Employee {
	private String id;
	private String name;
	private String salary;
	private String department;
	private String gender;
	private String address;
	
	public void setId(String id)
	{
		this.id=id;
	}
	public String getId()
	{
		return id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSalary(String salary)
	{
		this.salary=salary;
	}
	
	public String getSalary()
	{
		return salary;
	}
	
	public void setDepartment(String department)
	{
		this.department=department;
	}

	public String getDepartment()
	{
		return department;
	}
	
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String getAddress()
	{
		return address;
	}
	
}
