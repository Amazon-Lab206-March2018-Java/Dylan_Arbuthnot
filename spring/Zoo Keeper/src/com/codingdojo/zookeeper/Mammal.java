package com.codingdojo.zookeeper;

class Mammal {
	private Integer energyLevel;
	public Mammal() {
		this.energyLevel = 100;
	}
	public Integer displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	public Integer setEnergy(int val) {
		this.energyLevel += val;
		return this.energyLevel;
	}
}