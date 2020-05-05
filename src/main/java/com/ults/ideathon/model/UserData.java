package com.ults.ideathon.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserData {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID userId ;
	
	private String name;
	
	private String password;
	
	private Integer roleType;
	
	

	public UserData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserData(UUID userId, String name, String password, Integer roleType) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
		this.roleType = roleType;
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRoleType() {
		return roleType;
	}

	public void setRoleType(Integer roleType) {
		this.roleType = roleType;
	}
	
	
	
}
