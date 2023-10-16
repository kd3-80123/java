package com.sunbeam;

import java.util.Scanner;

class Person
{

	private String name;
	private String addr;
	Scanner sc = new Scanner(System.in);
    


    Person()
    {
        name="";
        addr="";
    }
    Person(String name,String addr)
    {
        this.name = name;
        this.addr = addr;
        
    }
   String get_name()
    {
        return this.name;
    }
    void set_name(String addr)
    {
        this.addr = addr;
    }
   String get_addr()
    {
        return this.addr;
    }

    void set_addr(String addr)
    {
        this.addr = addr;
    }
   
   
    void display()
    {
        System.out.println("The name is "+ get_name());
        System.out.println("The address is "+get_addr());
        
    }
    void accept()
    {
        System.out.println("Please enter name ");
        this.name = sc.next();
        System.out.println("Please enter address ");
        this.addr = sc.next();
        
        

    }  
    
}
