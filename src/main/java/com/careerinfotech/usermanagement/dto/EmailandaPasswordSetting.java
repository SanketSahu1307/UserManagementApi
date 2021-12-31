package com.careerinfotech.usermanagement.dto;


public class EmailandaPasswordSetting {

	private Long userId;
	private String email;
	private String password;
	private String newPwd;
	private String confirmPwd;
	
	public EmailandaPasswordSetting() {
		// TODO Auto-generated constructor stub
	}

	public Long getuserId() {
		return userId;
	}

	public void setuserId(Long userId) {
		this.userId = userId;
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

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public String getConfirmPwd() {
		return confirmPwd;
	}

	public void setConfirmPwd(String confirmPwd) {
		this.confirmPwd = confirmPwd;
	}

	public EmailandaPasswordSetting(Long userId, String email, String password, String newPwd, String confirmPwd) {
		super();
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.newPwd = newPwd;
		this.confirmPwd = confirmPwd;
	}

	@Override
	public String toString() {
		return "EmailandaPasswordSetting [userId=" + userId + ", email=" + email + ", password=" + password
				+ ", newPwd=" + newPwd + ", confirmPwd=" + confirmPwd + "]";
	}

	
	
	

	
}
