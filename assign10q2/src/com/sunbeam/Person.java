package com.sunbeam;

import java.util.Scanner;

public class Person implements Displayable{
	private String name;
	private int age;
	
	
	public void acceptData()
	
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the name");
		this.name = sc.next();
		System.out.println("Please enter the age");
		this.age = sc.nextInt();
		
		
	}
	public void displayData()
	{
		System.out.println("The name is"+ this.name);
		System.out.println("The age is"+ this.age);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
}
