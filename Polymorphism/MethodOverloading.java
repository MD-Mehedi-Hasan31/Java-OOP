package com.pondit.Polymorphism;
import java.util.Date;


public class MethodOverloading {
	
	
	public void methodOverloading() {
		System.out.println(System.currentTimeMillis());
		
		Date date= new Date();
		date.setTime(1637938116647L);
		System.out.println(date.toString());
	}
	public void methodOverloading(int age, String name) {
	 System.out.println("This method contain two parameter one of  tham are integer and others are String");

	}
	
	public void metodOverloading(int age, double value) {
		
		System.out.println("This method contains two parameter which are integer and double");
	}
	public void methodOverloading(String name) {
		System.out.println("This method contains String type parameter");
	}
	
	public void methodOverloading(int age) {
	
		System.out.println("This method contains Integer types parameter");
	}
	
	 
	public static void main(String args[]) {
		
	 MethodOverloading poly= new MethodOverloading();
	 poly.methodOverloading();
	 poly.methodOverloading(25,"Mehedi");
	 poly.methodOverloading("sakib");
	 poly.methodOverloading(25);
	 poly.metodOverloading(0, 1.25);
	}

}
