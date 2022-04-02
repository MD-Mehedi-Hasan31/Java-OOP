package com.pondit.Exception;

import com.pondit.encapsulation.HelloWorld;

public class ExceptionS {

	public static void main(String[] args) {
		
		//callMe();
		int a=10;
		int b=50;
		int c=a+b;
		System.out.println("the sum is : "+c);
		HelloWorld helloWorld = new HelloWorld();
		String version= helloWorld.version;
		int randomInt=helloWorld.getRandomInt();
	}
	public static void callMe() {
		System.out.println("I have been called....");
		callMeToo();
	} 
	
	
	public static void callMeToo() {
		System.out.println("I have been called from Call me too Method");
		callMeToo1();
	}
	
	public  static  void callMeToo1() {

        System.out.println("I Have been calling from call me Too 1 method");
	}

}
