package com.careerinfotech.usermanagement.dto;

public class UserSignIn {
	
	private Long id;
	private String email;
	private String password;
	
	public UserSignIn() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserSignIn(Long id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserSignIn [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	
	

	
}
