package com.sunbeam;

import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial {

	public static void main(String[] args) {
		

		System.out.println("Please enter the number for Factorial");
		int num1 = new Scanner(System.in).nextInt();
		Stream <Integer> strm = Stream.iterate(1, x -> x +1).limit(num1);
		int result = strm.reduce(1, (a,e)->a*e);
		System.out.println("The Factorial of "+num1+" is "+result);
	}

}
