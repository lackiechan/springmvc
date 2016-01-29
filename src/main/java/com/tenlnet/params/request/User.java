package com.tenlnet.params.request;

public class User {
	private String token;
	private String test;
	private String name;
	
	
	public User(String test, String name) {
		super();
		this.test = test;
		this.name = name;
	}


	public User() {
	}
	
	
	public User(String token, String test, String name) {
		super();
		this.token = token;
		this.test = test;
		this.name = name;
	}


	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getTest() {
		return test;
	}
	public void setTest(String test) {
		this.test = test;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
