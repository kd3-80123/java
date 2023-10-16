package com.sunbeam;

import java.util.Scanner;

class Sales_Manager extends Employee
{
	private double comm;

    Sales_Manager(double comm)
    {
        this.comm = comm;
    }
    Sales_Manager()
    {

    }
    public void display()
    {
     super.display();
        
    }
    public double getTotalSalary()
    {
    	
    	return getsal()*this.comm;
    }
    public void accept()
    {   
    	super.accept();
    	System.out.println("Please enter the commission");
    	Scanner sc = new Scanner (System.in);
    	this.comm = sc.nextDouble();
    }
}
