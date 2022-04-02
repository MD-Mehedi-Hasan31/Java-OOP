package com.pondit.Polymorphism;

public class MethodOverrinding2 extends MethodOverrinding1 {

	@Override
	public void Cow() {
		System.out.println("This is the From of the child class where i overriding the class.");
	}
	
public static void main(String args[]) {
		
		MethodOverrinding2 over= new MethodOverrinding2();
		  over.Cow();
		  
	}
}



