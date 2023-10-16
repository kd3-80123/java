package com.sunbeam;

import java.util.Scanner;

class Manager  extends Employee
{
private double bonus;

    Manager(double bonus,String addr,String name)
    {
    	super.set_name(name);
        super.set_addr(addr);
        this.bonus=bonus;
        
        
    }
    Manager()
    {
        this.bonus = 0;

    }
    public void get_bonus()
    {
        System.out.println("The bonus is :"+this.bonus);
    }
    public double getTotalSalary()
    {
    	
    	return getsal()+this.bonus;
    }
    public void setbonus(double bonus)
    {
        this.bonus=bonus;
    }
    @Override
    public void display()
    {    super.display();
    System.out.println("Bonus : "+this.bonus);
           

    }
    @Override
   
    public void accept()
    {
    	super.accept();
    	 System.out.println("Please enter Bonus");
         Scanner sc= new Scanner(System.in);
         this.bonus= sc.nextDouble();  
        
    }
    
   

}

