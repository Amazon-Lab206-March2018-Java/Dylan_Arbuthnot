package com.darbuth.rosters.models;

import java.util.*;

public class Team {
	private String team_name;
	private Integer id;
	private ArrayList<Player> players = new ArrayList<Player>();
	public static ArrayList<Team> teams = new ArrayList<Team>();
	public static Integer count = 0;
	public Team(String name) {
		this.team_name = name;
		this.id = count;
		count++;
		teams.add(this);
	}
	public String getTeamName() {
		return this.team_name;
	}
	public Integer getId() {
		return this.id;
	}
	public ArrayList<Player> getPlayers() {
		return this.players;
	}
	public void setTeamName(String name) {
		this.team_name = name;
	}
	public void addPlayer(Player player) {
		this.players.add(player);
	}
	public static Team findTeam(Integer id) {
		Team t = null;
		for(Team te : teams) {
			if (te.getId() == id) {
				t = te;
			}
		}
		return t;
	}
}
