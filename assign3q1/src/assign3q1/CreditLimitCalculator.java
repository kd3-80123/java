package assign3q1;

import java.util.Scanner;

public class CreditLimitCalculator {
	int accountNumber;
	int beginBalance;
	int charges;
	int credits;
	int creditlimit;
	
	
	
	

	public CreditLimitCalculator() {
		
		this.creditlimit = 10000;
	}

	public void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the account number");
		this.accountNumber = sc.nextInt();
		System.out.println("Please enter the beginning Balance of account");
		this.beginBalance = sc.nextInt();
		System.out.println("Please enter the charges for account");
		this.charges = sc.nextInt();
		System.out.println("Please enter the credit given to account");
		this.credits = sc.nextInt();
	}
	
	public void calculateNewBalance()
	{
		int newbalance = this.beginBalance-this.charges +this.credits;
		if(newbalance <-10000)
		{
			System.out.println("Your have exceeded your credit limit");
			
		}
		else
			System.out.println("Your balance is"+newbalance);
	}
}
