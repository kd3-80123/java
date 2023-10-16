package com.sunbeam;
class Box<T extends Employee>
{
	private T val;
	public void set(T val)
	{
		this.val = val;
	}
	public T get()
	{
		return this.val;
	}
	public double getTotalSalary()
	{
		return val.getTotalSalary();
	}
	

}

public class Program01 {
	public static void main(String[] args) {
		Manager m1 = new Manager();
		m1.accept();
		m1.display();
		
		Box <Manager> B1 = new Box<>(); 
		B1.set(m1);
		double sal = B1.getTotalSalary();
		System.out.println("The Total Salary of Manager is:"+sal);
		
		Salesman s1 = new Salesman();
		s1.accept();
		s1.display();
		
		Box<Salesman> B2 = new Box<>();
		B2.set(s1);
		double sal1= B2.getTotalSalary();
		System.out.println("The Total Salary of Manager is:"+sal1);
	}

}
