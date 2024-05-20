package com.myke.springboot.test1.springboot_test1.players;

public class Player {
	
	private int customer_id;
	private String name;
	private String team ="EWAN";
	public Player() {
	}
	public Player(int customer_id, String name) {
		super();
		this.customer_id = customer_id;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
