package com.example.lohiajute.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.lohiajute.dto.AdminDTO;



@Entity
@Table(name = "Admin")
public class Admin {

	@Id
    @Column(length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
	
    @Column( length = 255)
    private String adminName;
    
    @Column( length = 255)
    private String email;
    
    @Column( length = 255)
    private String password;

    //getter and setter methods
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
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

	//constructor
	public Admin(int adminId, String adminName, String email, String password) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.email = email;
		this.password = password;
	}

	//default constructor
	public Admin() {
	}
		
    
}
