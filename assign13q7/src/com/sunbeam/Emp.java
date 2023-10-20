package com.sunbeam;

public interface Emp {
	double getSal();
	default double calcIncentives() {
		return 0.0;
	}
	static double calcTotalIncome(Emp arr[])
	{
		double total =0.0 ;
		for (Emp emp : arr) {
			
			total += emp.calcIncentives()+emp.getSal();		
			
		}
	return total;
	}
}
