package assign11q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Program04 {
	static int menu()
	{
		int choice;
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete at book given index ;");
		System.out.println("4. Check if book with given isbn ");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order");
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
				list.add(B1);
				
				
				break;
			case 2://Display all books in forward order.
				for(Books b: list)
				{
					System.out.println(b);
				}
				
				
				break;
			case 3://Delete at book given index -- list.remove(index
				System.out.println("Please enter the index for deletion");
				int index =new Scanner(System.in).nextInt();
				list.remove(index);
				
				break;
			case 4://Check if book with given isbn is in list or not
				System.out.println("Please enter the isbn number to be found");
				String isbn = new Scanner(System.in).next();
				Books key = new Books();
				key.setIsbn(isbn);
				if(list.contains(key))
					System.out.println("The the serial number is found");
				else
					System.out.println("The serial number is not found");
				
				break;
			case 5://Delete all books in list
				list.clear();
				
				
				break;
			case 6://Display number of books in list
				System.out.println("The Number of books are"+list.size());
				
				break;
			case 7://Sort all books by price in desc order -- list.sort();
			{
				class ListComparator implements Comparator<Books>
				{

				@Override
				public int compare(Books arg0, Books arg1) {
					
					int diff = - Double.compare(arg0.getPrice(), arg1.getPrice());
					return diff;
				}
					
				}
				ListComparator l1 = new ListComparator();
				list.sort(l1);
				for (Books books : list) {
					System.out.println(books);
					
				}
			}
				
				break;
			}
		}

	}

}
