package com.jd.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.jd.domain.User;

public interface UserDao extends JpaRepository<User, Integer>{
	//����ɾ�Ĳ��Դ�
	
	//�޸�����
	@Transactional
	@Modifying
	@Query("update User set password = ?1 where username = ?2")
	public boolean jupdateUser(String password,String username);
	
	//�ж��û��Ƿ����
	@Transactional
	@Modifying
	@Query("select username from User where username = ?1")
	public String jisExist(String username);
}
