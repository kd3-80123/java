package com.sunbeam;

import java.util.Scanner;

public class program3 {
	static void calculate(double num1, double num2, Arithmetic op) {
		
	double result = op.calc(num1, num2);
	System.out.println("Result: "+result);
	}

	public static void main(String[] args) {
		
		int choice;
		do {
			double num1, num2; 
			System.out.println("Please enter your choice ");
			System.out.println("0. Exit ");
			System.out.println("1. Addition ");
			System.out.println("2. Subtraction ");
			System.out.println("3. Multiplication ");
			System.out.println("4. Division ");
			choice = new Scanner(System.in).nextInt();
			
			switch (choice) {
			case 1://addtion
				System.out.println("Please enter the num1 for Addition");
				num1=new Scanner(System.in).nextDouble();
				System.out.println("Please enter the num2 for Addition");
				num2=new Scanner(System.in).nextDouble();
				calculate(num1, num2, (x,y)-> x+ y);
				break;
			case 2://subtraction
				System.out.println("Please enter the num1 for Subtraction");
				num1=new Scanner(System.in).nextDouble();
				System.out.println("Please enter the num2 for Subtraction");
				num2=new Scanner(System.in).nextDouble();
				calculate(num1, num2, (x,y)-> x - y);
				
				break;
	        case 3://multiplication
	        	System.out.println("Please enter the num1 for multiplication");
				num1=new Scanner(System.in).nextDouble();
				System.out.println("Please enter the num2 for multiplication");
				num2=new Scanner(System.in).nextDouble();
				calculate(num1, num2, (x,y)-> x* y);
				
				break;
	        case 4://Division
	        	System.out.println("Please enter the num1 for Division");
				num1=new Scanner(System.in).nextDouble();
				System.out.println("Please enter the num2 for Division");
				num2=new Scanner(System.in).nextDouble();
				calculate(num1, num2, (x,y)-> x/ y);
		
	        	break;

			default:
				System.out.println("Wrong choice....");
				break;
			}
			
		}while(choice!=0);
		
		

	}

}
