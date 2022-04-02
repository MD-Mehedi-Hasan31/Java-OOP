package com.pondit.constractor;

public class testConstructo {

	
	
	  public int value; 
	  public String name;
	  
	  public void ValuePrintF(String name1, int value1) {
	  
	  this.name= name1;
	  this.value=value1;
	  System.out.println("This is from the value print F method");
	  System.out.println("Name: "+name+" Age: "+value1);
	  
	  }
	 
	
	public void ValuePrint(String name, int value) {
		
		System.out.println("This is from Value Print Method....");
		
		this.ValuePrintF(name, value);
	
	}
	
	
	public static void main(String args[]) {
		
		//Constractor cons= new Constractor("Mehedi",12);
		//NewConstractor constr= new NewConstractor("Md Mehedi Hasan sakib",150);
		
		testConstructo test= new testConstructo();
		
		test.ValuePrintF("Md Kabil Cowdhury", 20);
		//System.out.println("The Details is: "+details);
		
		System.out.println("==========================================");
		
		test.ValuePrint("Md Chowdhury", 70);
		
	}
}
