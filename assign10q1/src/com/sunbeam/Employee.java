package com.sunbeam;

import java.util.Scanner;


public abstract class Employee extends Person {
	
	    private int id;
	    private double sal;
    
	    Employee(int id, float sal)

	    {
	        this.id=id;
	        this.sal = sal;
	    }
	    Employee()
	    {
	        this.sal=3000;
	        this.id=1;

	    }
	    @Override
	    public void accept()
	    {
	    	super.accept();
	    	Scanner sc = new Scanner(System.in);
	        System.out.println(" Please enter Salary ");
	        this.sal = sc.nextFloat();
	        System.out.println("Please enter id");
	        this.id = sc.nextInt();
	        }
	    @Override
	    public void display()
	    
	    {
	    	super.display();
	        System.out.println("The salary is :"+sal);
	        System.out.println("The ID is :"+id);

	    }
	    public abstract double getTotalSalary();
	   
	    public void setsal(double sal)
	    {
	        this.sal=sal;
	    }
	    public double getsal()
	    {
	        return this.sal;
	    }
	    public void setid(int id)
	    {
	        this.id=id;
	    }
	    public int getid()
	    {
	    	return this.id;
	    }


	}


