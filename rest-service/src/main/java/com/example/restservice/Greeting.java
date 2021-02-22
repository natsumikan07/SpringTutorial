package com.example.restservice;

public class Greeting {
	private int id;
	private String name;

	//セッター
	public void setGreeting(int id, String name) {
		this.id = id;
		this.name = name;
	}

	//ゲッター
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
