package com.sunbeam;

public class Clerk implements Emp{
	double salary;

	public Clerk(double salary) {
		super();
		this.salary = salary;
	}
	public void salary() 
	{
		System.out.println("The salary of employee is"+this.salary);
	}
	@Override
	public double getSal() {
		
		return salary;
	}
	

}
