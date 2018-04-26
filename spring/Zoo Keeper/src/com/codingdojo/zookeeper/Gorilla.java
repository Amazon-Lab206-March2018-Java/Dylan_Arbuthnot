package com.codingdojo.zookeeper;

class Gorilla extends Mammal {
	public Gorilla() {
		this.displayEnergy();
	}
	public void throwSomething() {
		this.setEnergy(-5);
		System.out.println("The Gorilla has thrown something at you.");
	}
	public void eatBananas() {
		this.setEnergy(10);
		System.out.println("The Gorilla ate a banana and restored some energy.");
	}
	public void climb() {
		this.setEnergy(-10);
		System.out.println("The Gorilla climed a tree, how exhausting!");
	}
}