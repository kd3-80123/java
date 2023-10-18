package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	static int menu() 
	{
		System.out.println("Please Enter your Choice");
		System.out.println("0.Exit");
		System.out.println("1.Add Mango");
		System.out.println("2.Add Orange");
		System.out.println("3.Add Apple");
		System.out.println("4.Display Names of all fruits");
		System.out.println("5.Display all fruits in basket");
		System.out.println("6.Display tastes of all stale fruits in the basket");
		System.out.println("7.Mark the fruit as stale");
		System.out.println("8.Mark all sour fruits stale");
		int choice = new Scanner(System.in).nextInt();
		return choice;
		
	}

	public static void main(String[] args) {
		int choice,size,counter=0;
		System.out.println("Please input the how many fruits to be stored in basket");
		size= new Scanner(System.in).nextInt();
		Fruit [] fruit= new Fruit[size];
		
			while((choice=menu())!=0)
			{
				switch(choice)
					{	
						case 1:
							if(counter<size)
							{
								
								fruit[counter]= new Mango();
								fruit[counter].accept();
								counter++;
							}
							else
								System.out.println("Enter another choice");
						break;

					case 2:
						if(counter<size)
						{
						fruit[counter]= new Orange();
						fruit[counter].accept();
						counter++;
						}
						else
							System.out.println("Enter another choice");
						break;

					case 3:
						if(counter<size)
						{
						fruit[counter]= new Apple();
						fruit[counter].accept();
						counter++;
						}
						else
							System.out.println("Enter another choice");
						break;

					case 4:
						for (Fruit fruit2 : fruit) {
							System.out.println("Name of fruit is :"+fruit2.getName()); 
							
						}
						
						break;

					case 5:
						for (Fruit fruit2 : fruit) {
							
							System.out.println(fruit2);
							
						}
						break;

					case 6:
						for (Fruit fruit2: fruit) {
							if(!fruit2.isFresh())
							{
								System.out.println(fruit2.taste());
							}
							else
								System.out.println("fruits is fresh");
						}
						break;

					case 7:
						System.out.println("Please enter the index for marking the fruit as Stale");
						int choice1= new Scanner(System.in).nextInt();
						fruit[choice1].setFresh(false);
						break;

					case 8:
						break;
					default:
						System.out.println("Wrong choice.......");
						break;
			
					
				}

			}

		}
	
	}
