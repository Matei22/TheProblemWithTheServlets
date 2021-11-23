package com.to;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table
public class Player {
	
	@Id
	private int playerId;
	private String name;
	private String teamName;
	private int age;
	public Player() {
		
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", name=" + name + ", teamName=" + teamName + ", age=" + age + "]";
	}
	
	
	public Player(int playerId, String name, String teamName, int age) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.teamName = teamName;
		this.age = age;
	}


	

}
