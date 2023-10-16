package com.sunbeam;

import java.util.Scanner;

class Salesman extends  Employee
{

private float comm;
    
    Salesman(int id, float sal, float comm)
    {
        this.comm = comm;
    }
    Salesman()
    {
        this.comm = 1;
    }
    public double getTotalSalary()
    {
    	
    	return getsal()*this.comm;
    }
    void get_comm()
    {
        System.out.println("The commission is"+this.comm);

    }
    public void set_comm(float comm)
    {
        this.comm = comm;
    }
public void display()
    {
        super.display();
        get_comm();

    }
public void accept()
    {
		super.accept();
        System.out.println("Please enter the commission :");
        Scanner sc = new Scanner(System.in);
        this.comm = sc.nextFloat();
        
        
    }
   
}

