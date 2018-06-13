package com.jd.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.jd.domain.User;

public interface UserDao extends JpaRepository<User, Integer>{
	//简单增删改查自带
	
	//修改密码
	@Transactional
	@Modifying
	@Query("update User set password = ?1 where username = ?2")
	public boolean jupdateUser(String password,String username);
	
	//判断用户是否存在
	@Transactional
	@Modifying
	@Query("select username from User where username = ?1")
	public String jisExist(String username);
}
