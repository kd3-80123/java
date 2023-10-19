package com.sunbeam;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program2 {

	public static void main(String[] args) {
		Set <Books> set = new LinkedHashSet<>(); 
		//here books are stored in order they are inputed
		//it adds and prints the duplicate isbn books as equals and hashcode 
		// method is not implemented
		
		set.add(new Books("abc", 600, "saurabh", 20));
		set.add(new Books("abe", 700, "sandesh", 10));
		set.add(new Books("abh", 800, "samved", 10));
		set.add(new Books("abo", 900, "ghruha", 20));
		set.add(new Books("abn", 400, "bholanath", 40));
		set.add(new Books("abq", 500, "order", 50));
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


