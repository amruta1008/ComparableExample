package com.team;

import java.util.ArrayList;
import java.util.List;

import com.player.Player;

public class Team  implements Comparable<Team>{
	private String name;
	private List<Player> playerList = new ArrayList<>();

	
	public Team()
	{
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

	public List<Player> getPlayerList() {
		return playerList;
	}

	public Team(String name) {
		this.name = name;
	}

	public void addPlayer(String playerName) {
		Player p = new Player(playerName);
		playerList.add(p);
	}

	@Override
	public int compareTo(Team o) {
		return this.name.compareTo(o.name);
	}
}
