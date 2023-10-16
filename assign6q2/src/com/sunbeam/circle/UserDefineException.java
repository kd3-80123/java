package com.sunbeam.circle;



public class UserDefineException extends Exception{
	
	private String sName; 

     
	public UserDefineException(String sName) {
		
		this.sName = sName;
	}


	public void display()
	{
		System.err.println(sName);
	}
      
      
      
}