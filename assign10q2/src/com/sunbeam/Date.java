package com.sunbeam;

import java.util.Scanner;

public class Date implements Displayable{
	private int day, month , year ;
	
	
	public void acceptData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the day");
		this.day = sc.nextInt();
		System.out.println("Please enter the month");
		this.month = sc.nextInt();
		System.out.println("Please enter the year");
		this.year = sc.nextInt();
		
	}
	
	public void displayData(){
		
			System.out.println("The Date is "+day + "/"+ month +"/"+ year);
		
		
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	

}
