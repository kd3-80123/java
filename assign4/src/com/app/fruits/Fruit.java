package com.app.fruits;

import java.util.Scanner;

public class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isFresh;
	
	public Fruit(String name) {
		
		
		this.name = name;
		this.isFresh =true;
	}
	void accept()
	{
		System.out.println("Please enter the weight on furit");
		this.weight = new Scanner(System.in).nextDouble();
		System.out.println("Please enter the color on furit");
		this.color = new Scanner(System.in).next();
	}
	


	public boolean isFresh() {
		return isFresh;
	}
	public String getName() {
		return name;
	}
	
	
//	public String toString()
//	{
//		return "Color :"+this.color+"\n weight :"+this.weight+"\n name :"+this.name;
//	}
//	
	
	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	@Override
	public String toString() {
		return "Fruit [color=" + this.color + ", weight=" + this.weight + ", name=" + this.name + ", isFresh=" + isFresh + ", taste()="
				+ taste() + "]";
	}
	public String taste()
	{
		return "no specific taste";
	}
}
class Apple extends Fruit{
	
	

	public Apple() {
		
		super("Apple");
		
	}

	
	@Override
	public String taste()
	{
		return "sweet n sour";
	}
	
	
}
class Mango extends Fruit{
	
	
	public Mango() {
		super("Mango");
	
	}
	@Override
	public String taste()
	{
		return "sweet";
	}
	
	
}
class Orange extends Fruit{
	
	
	public Orange() {
		super("orange");
		
	}
	@Override
	public String taste()
	{
		return "sour";
	}
	
	
}