package com.pondit.constractor;

public class NewConstractor extends Constractor {

	public String name;
	public int age;
	public NewConstractor(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
		
		this.name=name;
		this.age=age;
	}
		
	public void getPersonDetails() {
		System.out.println("Name: "+name+" age"+age);
	}
}
