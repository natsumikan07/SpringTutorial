package com.example.restservice;

public class Greeting {
	//Long型のid。
	//contet。
	private Long id;
	private String content;

	//コンストラクタ
	public Greeting(Long id, String name) {
		this.id = id;
		this.content = name;
	}

	//ゲッター
	public Long getId() {
		return id;
	}

	public String getName() {
		return content;
	}
}
