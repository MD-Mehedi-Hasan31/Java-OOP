package com.pondit.inheritence;

public class Cat extends Dog {

	private String color;
	
	/*
	 * public void setSuperColor(String color) {
	 * 
	 * super.setColor(color); }
	 */
	
	public String getColor() {
		
		return color;
	}
	
	public void setColor(String color) {
		
		this.color=color;
		//	super.setColor(color1);
	}
	
	
	  @Override 
	  public void setSuperColor(String color)
	  { 
		  super.setColor(color);
	  }
	 
	
	public void display() {
		System.out.println("This is child class: "+this.color);
		System.out.println("This is Dog class which is the super class of the packeg : "+super.getColor());
		System.out.println(this.getColor().hashCode());
		System.out.println(super.getColor().hashCode());
		
	}
	
	public static void main(String args[]) {

		//MotorBike motorBike = new MotorBike();

		Cylinder aCylinder = new Cylinder(25.5,"Blue",10);
		double area= aCylinder.getArea();
		double volume= aCylinder.getVolume();
		System.out.println("The  volume of the cylinder is: "+ volume);
		//System.out.println("The  area  of the Cylinder is: "+area);


	/*	AdvanceCalculator calculator= new AdvanceCalculator();
		int calculateValue=  calculator.add(25,35);
		System.out.println("The  calculate Value Is: "+ calculateValue);
*/
		/*Calculator cal= new Calculator();
		int calValue= cal.add(50,100);
		System.out.println("The calculate value  is: "+calValue);*/

		/*Cat cat1= new Cat();
		cat1.setColor("Black");
		cat1.setSuperColor("Magenta");
		 
		 Dog aDog= new Dog();
		 	
		 aDog.setSuperColor("Megenta");
	
		 cat1.display();
		*/
		
	}
}
