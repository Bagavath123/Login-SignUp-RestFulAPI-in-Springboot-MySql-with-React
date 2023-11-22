package com.example.lohiajute.dto;

public class LoginDTO {

	private String adminName;
	
	private String password;

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LoginDTO(String adminName, String password) {
		super();
		this.adminName = adminName;
		this.password = password;
	}
	
	public LoginDTO() {
		
	}
}
