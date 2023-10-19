package com.sunbeam;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class program04 {

	public static void main(String[] args) {
		
		class BookComparator implements Comparator<Books>
		{

			
			@Override
			public int compare(Books arg0, Books arg1) {
				int diff = -Double.compare(arg0.getPrice(), arg1.getPrice());
				return diff;
			}
			
		}
		BookComparator book = new BookComparator();
		Set <Books> set = new TreeSet<>(book); 
		set.add(new Books("abc", 600, "saurabh", 20));
		set.add(new Books("abe", 700, "sandesh", 10));
		set.add(new Books("abh", 800, "samved", 10));
		set.add(new Books("abo", 900, "ghruha", 20));
		set.add(new Books("abn", 400, "bholanath", 40));
		set.add(new Books("abq", 500, "order", 50));
		set.add(new Books("abe", 700, "sandesh", 10));//duplicate value
		set.add(new Books("abm", 600, "saurabh", 20));
		
		Iterator<Books> itr =set.iterator();
		
		System.out.println("As per comparator sort");
		System.out.println("*****************************");
		while(itr.hasNext())
		{
			Books book1 = new Books();
			book1 = itr.next();
			System.out.println(book1);
			
		}
//		NavigableSet<Books> revSet = ((TreeSet<Books>) set).descendingSet();
//		System.out.println("Reverse order"+revSet);
		System.out.println("*****************************");
		
		System.out.println("As per desecnding comparator sort");
		System.out.println("*****************************");
		Iterator<Books> itr3 = ((TreeSet<Books>) set).descendingIterator();
		while(itr3.hasNext()) {
			Books e = itr3.next();
			System.out.println(e + ", ");
		}
	
		

	}

}
