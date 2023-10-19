package com.sunbeam;


import java.util.Scanner;

public class Books implements Comparable<Books> {

	 private String isbn;
	 private double price; 
	  private String authorName; 
	  private int quantity;
	 
	  Books()
	  {}
	public Books(String isbn, double price, String authorName, int quantity) {
		
		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void acceptData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the serial code of book");
		this.isbn = sc.next();
		System.out.println("Please enter the price of book");
		this.price = sc.nextDouble();
		System.out.println("Please enter the author  of book");
		this.authorName = sc.next();
		System.out.println("Please enter the Quantity code of book");
		this.quantity = sc.nextInt();
		
		
	}
	
	
	@Override
	public String toString() {
		return "Books [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}
	@Override
	public int compareTo(Books o) {
		int diff = this.isbn.compareTo(o.isbn);
		return diff;
	}
}
