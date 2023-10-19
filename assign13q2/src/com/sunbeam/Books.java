package com.sunbeam;

	import java.util.Objects;
	import java.util.Scanner;

	public class Books {

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
//		@Override
//		public int hashCode() {
//			return Objects.hash(isbn);
//		}
//		@Override
//		public boolean equals(Object obj) {
//			if (this == obj)
//				return true;
//			if (obj == null)
//				return false;
//			if (getClass() != obj.getClass())
//				return false;
//			Books other = (Books) obj;
//			return Objects.equals(isbn, other.isbn);
//		}
		//when hashCode() and equals method is overriden then the duplicated 
		//are not printed in the display
		@Override
		public int hashCode()
		{
			int hash = Objects.hash(this.isbn);
			return hash;
			
		}
		@Override
		public boolean equals(Object obj)
		{
			if(obj==null)
				return false;
			if(this == obj)
				return true;
			if(obj instanceof Books) {
				Books book = (Books) obj;
				if(this.isbn== book.isbn)
					return true;
				
			}
			return false;
		}
		
	}



