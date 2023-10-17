package com.sunbeam;

import java.util.Comparator;



 class Doublesort implements Comparator < Double > 
 {
	 @Override
	 public int compare(Double num1, Double num2)
	 {
		 int diff= Double.compare(num1, num2);
		 return diff;
	 }
	 
 }
 public class Program02 {
		static <T> void selectionSort(T[] arr, Comparator<T> c) 
		{
			for(int i=0; i<arr.length-1; i++) 
			{
				for(int j=i+1; j<arr.length; j++) 
				{
					if(c.compare(arr[i], arr[j]) > 0) 
					{
						T temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
	public static void main(String[] args) {
		Double [] arr = {11.2,58.56,15.6,20.56,19.56};
		Doublesort D1 = new Doublesort();
		selectionSort(arr,D1);
		System.out.println("Array after sorting");
		for (Double double1 : arr) {
			
			System.out.println(double1);
			
		}
		

	}

}
