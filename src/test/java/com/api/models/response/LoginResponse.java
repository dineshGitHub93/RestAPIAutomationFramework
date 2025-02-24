package com.api.models.response;

import java.util.List;

public class LoginResponse {
	
	private String username;
	private String token;
	private String type;
	private int id;
	private String email;
	private List<String> roles;
	
	public LoginResponse() {
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "LoginResponse [username=" + username + ", token=" + token + ", type=" + type + ", id=" + id + ", email="
				+ email + ", roles=" + roles + "]";
	}

		
	

}
