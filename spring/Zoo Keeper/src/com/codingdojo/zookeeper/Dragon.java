package com.codingdojo.zookeeper;

public class Dragon extends Mammal {
	public Dragon() {
		this.setEnergy(200);
	}
	public void fly() {
		this.setEnergy(-50);
		System.out.println("Whooooosh! The Dragon takes off into the air.");
	}
	public void eatHumans( ) {
		this.setEnergy(25);
		System.out.println("Arrrrrrrgh! You hear screams in the distance as the Dragon has its meal.");
	}
	public void attackTown() {
		this.setEnergy(-100);
		System.out.println("Sizzle, sizzle. A fire roars as a town burns in the distance.");
	}
}
