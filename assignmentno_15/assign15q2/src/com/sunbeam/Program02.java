package com.sunbeam;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class Program02 {
	public static void WriteFile(ArrayList<Books> list)
	{
		
		try(FileOutputStream fout = new FileOutputStream("Book2.txt"))
		{
			try(ObjectOutputStream oout = new ObjectOutputStream(fout))
			{
				oout.writeObject(list);
				
			}
			System.out.println("File saved successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void ReadFile(ArrayList<Books> list)
	{
		ArrayList<Books> list1;
		try(FileInputStream fin = new FileInputStream("Book2.txt"))
		{
			try(ObjectInputStream oin = new ObjectInputStream(fin))
			{
				for (Books b1 : list) {
					
					        list1 =(ArrayList<Books>) oin.readObject();
					        for (Books books : list1) {
					        	System.out.println(books);
								
							}
					        	
					        	
					        }
								
							
				}
		}
		catch(EOFException e)
		{
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static int menu()
	{
		int choice;
		System.out.println("0. Exit");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn ;");
		System.out.println("4. Delete a book at given index ");
		System.out.println("5. Delete a book with given isbn");
		System.out.println("6. Reverse the list");
		System.out.println("7. Save the Books in file");
		System.out.println("8. Retrive the Books from file");
		
		System.out.println("Please enter the choice");
		Scanner sc= new Scanner(System.in);
		choice = sc.nextInt();
		return choice;
	}
	public static void main(String[] args) {
		
		ArrayList<Books> list = new ArrayList<Books>();
		int choice;
		while((choice = menu())!=0)
		{
			switch(choice)
			{
			case 1:
				Books B1 = new Books();
				B1.acceptData();
				if(list.contains(B1))
					
				{
					int key = list.indexOf(B1);
					list.get(key).setQuantity(list.get(key).getQuantity()+ B1.getQuantity());
				}
				else
					list.add(B1);
			
				
				break;
				
			case 2://Display all books in forward order.
				for(int i=0;i<list.size();i++)
				{
					Books b = list.get(i);
					System.out.println(b);
				}
				break;
				
			case 3://Search a book with given isbn
				System.out.println("Please enter the isbn number to be found");
				String isbn = new Scanner(System.in).next();
				Books key = new Books();
				key.setIsbn(isbn);
				if(list.contains(key))
				 {
					int index =	list.indexOf(key);
					System.out.println(key);
					
					
				 }
				else
					System.out.println("The serial number is not found");
				break;
				
			case 4:
				
				System.out.println("Please enter the isbn number to be found");
				int index = new Scanner(System.in).nextInt();
				list.remove(index);
				break;
				
			case 5:
				System.out.println("Please enter the isbn number to be found");
				String isbn1 = new Scanner(System.in).next();
				Books key1 = new Books();
				key1.setIsbn(isbn1);
				if(list.contains(key1))
				 {
					int index1 = list.indexOf(key1);
						list.remove(index1);
					
								
				 }
				else
					System.out.println("The serial number is not found");
				break;
				
			case 6:
				Collections.reverse(list);
				System.out.println(list);
				break;
			case 7:
				WriteFile(list);
				break;
			case 8:
				ReadFile(list);
				break;
				
			}
		}
	}

}
