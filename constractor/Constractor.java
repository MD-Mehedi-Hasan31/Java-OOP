package com.pondit.constractor;



public class Constractor {
	
	public String name;
	public int age;
	
	
	/*
	 * public Constractor() {
	 * 
	 * }
	 */
	public Constractor(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	

	
	  public void getName() { 
		  
		  System.out.println("Name "+name+" age "+age); 
		  
	  }
	 
}
