package com.jd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jd.domain.User;

public interface UserDao extends JpaRepository<User, Integer>{
	//����ɾ�Ĳ��Դ�
}
