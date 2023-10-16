package com.sunbeam;

public class Program01 {
	public static void printDisplayBox(Box<? extends Displayable> b)
	{
		b.get().displayData();
	}
	
	public static void printBox(Box <?> b)
	{
		System.out.println(b.get().toString());
	}

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.acceptData();
	
		
		Box <Person> b1 = new Box<>();
		b1.set(p1);
		printDisplayBox(b1);
		printBox(b1);
		
		Date D1 = new Date();
		D1.acceptData();
		Box <Date> B2 = new Box<>();
		B2.set(D1);
		printDisplayBox(B2);
		printBox(B2);
	

	}

}
