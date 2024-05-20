package com.myke.springboot.test1.springboot_test1.players;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Player")
public class Player {
	
	@Id
	@Column(name = "player_id", nullable = false)
	private Integer playerId;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "team", nullable = false, columnDefinition = "VARCHAR(50)")
	private String team;
	
	@Column(name = "position", nullable = false)
	private String position;
	
	public Player() {
	}
	
	public Player(Integer playerId, String name, String team, String position) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.team = team;
		this.position = position;
	}
	public Integer getPlayerId() {
		return playerId;
	}
	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	

}
