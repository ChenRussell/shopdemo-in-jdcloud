package com.jd.controller;


import javax.validation.constraints.Size;




import org.hibernate.validator.constraints.NotEmpty;




import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="s_user")
public class User {
	@Id
	private int userid;
	private String username;
	private String password;
	
	public User() {
		
	}
	
	public User(int userid, String username, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	@NotEmpty(message="用户不能为空")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Size(min=3,max=10,message="密码长度不正确")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
