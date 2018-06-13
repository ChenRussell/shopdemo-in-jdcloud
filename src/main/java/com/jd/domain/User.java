package com.jd.domain;


import javax.validation.constraints.Size;


import org.hibernate.validator.constraints.NotEmpty;


public class User {
	
	private int id;
	private String username;
	private String password;
	
	public User() {
		super();
	}

	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@NotEmpty(message="�û�����Ϊ��")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	@Size(min=1,max=10,message="���볤����1��10֮��")
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
