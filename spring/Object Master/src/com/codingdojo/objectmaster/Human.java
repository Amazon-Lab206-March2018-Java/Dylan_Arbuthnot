package com.codingdojo.objectmaster;

public class Human {
	private String name;
	private Integer strength;
	private Integer stealth;
	private Integer intelligence;
	private Integer health;
	public Human() {
		this.name = null;
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}
	public void attack(Human hum) {
		Integer dmg = this.getStrength();
		hum.adjustHealth(-dmg);
		System.out.println(this.getName() + " attacked " + hum.getName() + " for " + dmg + " points of damage!");
		System.out.println(hum.getName() + " has " + hum.getHealth() + " health left.");
	}
	public String getName() {
		return name;
	}
	public Integer getStrength() {
		return strength;
	}
	public Integer getStealth() {
		return stealth;
	}
	public Integer getIntelligence() {
		return intelligence;
	}
	public Integer getHealth() {
		return health;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStrength(Integer strength) {
		this.strength = strength;
	}
	public void setStealth(Integer stealth) {
		this.stealth = stealth;
	}
	public void setIntelligence(Integer intelligence) {
		this.intelligence = intelligence;
	}
	public void setHealth(Integer health) {
		this.health = health;
	}
	public void adjustHealth(Integer val) {
		this.health += val;
	}
}
