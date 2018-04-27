package com.darbuth.pets.models;

public class Dog extends Animal implements Pet  {
	public Dog() {
		
	}
	public Dog(String name, String breed, Integer weight) {
		super(name, breed, weight);
	}
	public String showAffection() {
		if (getWeight() < 30) {
			return (getName() + " hopped into your lap and cuddled you to death!");
		}
		return (getName() + " curled up next to you and is snoring loudly. You wonder what " + getName() + " is dreaming about.");
	}
}
