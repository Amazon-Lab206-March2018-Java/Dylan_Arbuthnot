package com.darbuth.rosters.models;

import java.util.ArrayList;

public class Player {
	private String first_name;
	private String last_name;
	private Integer age;
	private Integer id;
	public static ArrayList<Player> players = new ArrayList<Player>();
	public static Integer count = 0;
	public Player(String first_name, String last_name, Integer age) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.id = count;
		count++;
		players.add(this);
	}
	public String getFirstName() {
		return this.first_name;
	}
	public String getLastName() {
		return this.last_name;
	}
	public Integer getAge() {
		return this.age;
	}
	public Integer getId() {
		return this.id;
	}
	public void setFirstName(String name) {
		this.first_name = name;
	}
	public void setLastName(String name) {
		this.last_name = name;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public static Player findPlayer(Integer id) {
		Player p = null;
		for(Player pl : players) {
			if (pl.getId() == id) {
				p = pl;
			}
		}
		return p;
	}
	public static void deletePlayer(Player player) {
		player = null;
		System.gc();
	}
}
