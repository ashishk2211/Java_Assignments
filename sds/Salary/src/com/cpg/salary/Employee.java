package com.cpg.salary;

public class Employee {
	private String name;
	private char gender;
	private String category;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws SalaryNegativeException {
		try {
		if(salary>0)
			this.salary=salary;
		else
			throw new SalaryNegativeException("Invalid salary");
		}
		catch(SalaryNegativeException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	

}
