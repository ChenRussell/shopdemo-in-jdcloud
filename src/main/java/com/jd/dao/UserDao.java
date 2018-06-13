package com.jd.dao;

import java.util.List;

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
	@Query("update User set password = ?1 where userid = ?2")
	public int jupdateUser(String password,Integer userid);
	
	
	@Query("select u from User u where u.username = ?1 and u.password=?2")
	public List<User> isExist(String username,String password);

}
