package com.sunbeam.dailydrivingcost;

import java.util.Scanner;

public class DailyDrivingCost {

	double totalMiles;
	double costOfGallon;
	double averageMile;
	double parkingFees;
	double tollFees;
	
	public void CostPerDay()
	{
		double milesPerDay =this.totalMiles / this.averageMile;
	
		double costOfGasPerDay =  milesPerDay * this.costOfGallon ;
		
		double costPerDay = costOfGasPerDay + this.parkingFees + this.tollFees ;
		
		double monthlyCost = costPerDay * 30;
		double perPersonCost = monthlyCost / 4;
		double savingByCarPooling = perPersonCost * 3 ;
		System.out.println("Cost of Driving per day :"+costPerDay);
		System.out.println("Cost of Driving per Month :"+ monthlyCost);
		System.out.println("Savings by Car Pooling :"+ savingByCarPooling);
			
	}
	public void acceptData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Total miles driven per day:");
		this.totalMiles = sc.nextDouble();
		System.out.print("Please enter Cost per gallon of gasoline :");
		this.costOfGallon = sc.nextDouble();
		System.out.print("Please enter Average miles per gallon :");
		this.averageMile = sc.nextDouble();
		System.out.print("Please enter Parking fees per day :");
		this.parkingFees = sc.nextDouble();
		System.out.print("Please enter Tolls per day :");
		this.tollFees = sc.nextDouble();
		
	}
}
