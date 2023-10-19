package com.sunbeam;
import java.util.Scanner;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Program5 {
	

	public static void main(String[] args) {
		

		Map<String,Books> map = new HashMap<>();
		//BookComparator book = new BookComparator();
		int choice;

		do{
			System.out.println("Please enter the choice ");
			System.out.println("1. Insert Book in map ");
			System.out.println("2. Find Book in map ");
			choice = new Scanner(System.in).nextInt();
		switch (choice) {
			case 1:
				Books book1 = new Books();
				book1.acceptData();
				map.put(book1.getIsbn(), book1);
		
				break;
			case 2:
				System.out.println("Please enter ISBN for searching book");
				String isbn = new Scanner(System.in).next();
				Books book2 = new Books();
				book2 = map.get(isbn);
				System.out.println(book2);
		
				break;

			default:
				System.out.println("Wrong choice");
				break;
	 }
	}while(choice!=0);

	}

}
