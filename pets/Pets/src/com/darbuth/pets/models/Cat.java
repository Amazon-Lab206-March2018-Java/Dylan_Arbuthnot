package com.darbuth.pets.models;

public class Cat extends Animal implements Pet  {
	public Cat() {
		
	}
	public Cat(String name, String breed, Integer weight) {
		super(name, breed, weight);
	}
	public String showAffection() {
		return (getName() + " stares at you from a distance. You think you saw " + getName() + " blink which must be a good sign. Maybe?");
	}
}
