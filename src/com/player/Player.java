package com.player;

public class Player implements Comparable<Player>{
	
	private String name;
	
	@Override
	public String toString() {
		return  "--"+name ;
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Player p) {
		return this.name.compareTo(p.name);
	}

}
