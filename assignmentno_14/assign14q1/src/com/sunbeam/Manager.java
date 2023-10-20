package com.sunbeam;

public class Manager implements Emp {
private double basicSalary;
private double dearanceAllowance;

public Manager(double basicSalary, double dearanceAllowance) {
	super();
	this.basicSalary = basicSalary;
	this.dearanceAllowance = dearanceAllowance;
}
@Override
public double getSal() {
	
	return basicSalary + dearanceAllowance;
}
public double calcIncentives() 
{
	return (0.20 * basicSalary);
}

}
