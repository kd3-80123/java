package com.sunbeam;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Program3 {

	public static void main(String[] args) {
		Set <Books> set = new TreeSet<>(); 
		//here books are stored in key element ascending order
		//here only comparable method is while in Books class   
		// method is not implemented
		
		set.add(new Books("abc", 600, "saurabh", 20));
		set.add(new Books("abe", 700, "sandesh", 10));
		set.add(new Books("abh", 800, "samved", 10));
		set.add(new Books("abo", 900, "ghruha", 20));
		set.add(new Books("abn", 400, "bholanath", 40));
		set.add(new Books("abq", 500, "order", 50));
		set.add(new Books("abe", 700, "sandesh", 10));//duplicate value
		set.add(new Books("abm", 600, "saurabh", 20));
		Iterator itr =set.iterator();
		while(itr.hasNext())
		{
			Books book = new Books();
			book = (Books) itr.next();
			System.out.println(book);
			
		}
		
	}
}


