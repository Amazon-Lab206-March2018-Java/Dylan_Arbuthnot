package com.codingdojo.objectmaster;

public class HumanTest {
	public static void main(String[] args) {
		Human bob = new Human();
		bob.setName("Bob");
		Human rob = new Human();
		rob.setName("Rob");
		rob.attack(bob);
	}
}
