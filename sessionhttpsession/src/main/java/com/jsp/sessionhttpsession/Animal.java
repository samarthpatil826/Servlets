package com.jsp.sessionhttpsession;

public class Animal {

	String animal;
	String color;
	
	
	public Animal() {
		
	}


	public Animal(String animal, String color) {
		this.animal = animal;
		this.color = color;
	}


	@Override
	public String toString() {
		return "Animal [animal=" + animal + ", color=" + color + "]";
	}
	
	
	
}
