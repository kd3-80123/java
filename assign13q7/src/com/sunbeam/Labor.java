package com.sunbeam;
import java.util.Scanner;

public class Labor implements Emp{
	int hours;
	int rate;
	
	
	
	public Labor(int hours, int rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	
	}
	@Override
	public double getSal() {
		
		return hours* rate;
	}
	public double calcIncentives() 
	{ double incentive;
		if (hours > 300)
		{
		 incentive = 0.5 * getSal();
			return incentive;
		}
			
		else
			return 0.0;
			
			
	}

}
