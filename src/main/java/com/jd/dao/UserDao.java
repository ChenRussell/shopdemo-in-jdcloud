package com.jd.dao;

import com.jd.domain.User;

public interface UserDao {
	//����û�
	public boolean addUser(User user);
	
	//�����û�����
	public boolean updateUser(User user);
	
	//�����û�idɾ���û�
	public boolean delUser(int userid);
	
	//��ѯ�û�������Ϣ
	public User findAll();
	
	//�ж��û��Ƿ����
	public User isExist(String username);

}
