package com.student;

import java.util.Arrays;
import java.util.Comparator;
class StudentComparator implements Comparator<Student>
{
	@Override
	public int compare(Student s1, Student s2)
	{
		int diff = - s1.getCity().compareTo(s2.getCity());
		if (diff ==0)
		{
			diff = - Double.compare(s1.getMarks(), s2.getMarks());
			
			if(diff == 0)
				
				diff = s1.getName().compareTo(s2.getName());
			return diff;
		}
		return diff;
		
	}
	
		
	
}

public class Program03 {
	
	
	
	

	public static void main(String[] args) {
		Student [] arr= new Student[5];
		arr[0]= new Student(1, "Saurabh", "Ratnagiri", 50);
		arr[1]= new Student(2, "Mane", "Devrukh", 60);
		arr[2]= new Student(3, "Ruturaj", "Ashta", 80);
		arr[3]= new Student(4, "Sanket", "Satara", 70);
		arr[4]= new Student(5, "Shiva", "Kolhapur", 50);
		System.out.println("Before sort");
		for (Student student : arr) {
			
			System.out.println(student);
			
		
		}
		StudentComparator studentC1Comparator = new StudentComparator();
		Arrays.sort(arr, studentC1Comparator);
		System.out.println("After sort");
		for (Student student1 : arr) {
			
			System.out.println(student1);
	
		}
			
			
	}
}
