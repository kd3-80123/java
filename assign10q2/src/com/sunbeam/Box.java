package com.sunbeam;

public class Box <T extends Displayable>{
	private T obj;
	
	public void set(T val)
	{
		this.obj= val;
	}
	
	public T get()
	{
		return this.obj;
	}

}
