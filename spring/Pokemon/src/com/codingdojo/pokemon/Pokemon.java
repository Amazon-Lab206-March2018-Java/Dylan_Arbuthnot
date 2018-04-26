package com.codingdojo.pokemon;

public class Pokemon{
	private String name;
	private Integer health;
	private String type;
	public static Integer count = 0;
	public Pokemon(String name, Integer health, String type) {
		this.name = name;
		this.health = health;
		this.type = type;
		count++ ;
	}
	public String getName() {
		return name;
	}
	public Integer getHealth() {
		return health;
	}
	public String getType() {
		return type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setHealth(Integer health) {
		this.health = health;
	}
	public void setType(String type) {
		this.type = type;
	}
}
