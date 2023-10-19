package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program01 {

	public static void main(String[] args) {
		Set <Books> set = new HashSet<>(); 
		//here books are stored in random order
		//it adds and prints the duplicate isbn books as equals and hashcode 
		// method is not implemented
		//ISN duplicate order is solved by Override the hashCode and equals methos
		set.add(new Books("abc", 600, "saurabh", 20));
		set.add(new Books("abe", 700, "sandesh", 10));
		set.add(new Books("abh", 700, "samved", 10));
		set.add(new Books("abo", 700, "ghruha", 20));
		set.add(new Books("abn", 700, "bholanath", 40));
		set.add(new Books("abq", 700, "order", 50));
		set.add(new Books("abe", 700, "sandesh", 10));//duplicate value
		Iterator itr =set.iterator();
		while(itr.hasNext())
		{
			Books book = new Books();
			book = (Books) itr.next();
			System.out.println(book);
			
		}
		
	}

}
