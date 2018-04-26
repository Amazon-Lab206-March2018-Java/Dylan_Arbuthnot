package com.codingdojo.objectmaster;

public class Ninja extends Human {
	public Ninja() {
		this.setStealth(10);
	}
	public Ninja(String name) {
		this.setName(name);
		this.setStealth(10);
	}
	public void steal(Human hum) {
		Integer dmg = this.getStealth();
		hum.adjustHealth(-dmg);
		this.adjustHealth(dmg);
		System.out.println(this.getName() + " used Steal on " + hum.getName() + ". " + dmg + " health points were stolen from " + hum.getName() + " and added to " + this.getName());
	}
	public void runAway() {
		this.adjustHealth(-10);
		System.out.println(this.getName() + " used Run Away to flee the battle. " + 10 + " points of damage were taken while fleeing.");
	}
}
