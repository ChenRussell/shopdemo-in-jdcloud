package com.jd.mapper;

import com.jd.domain.User;

public interface UserMapper {
	    //����û�
		public boolean addUser(User user);
		
		//�����û�����
		public boolean updateUser(User user);
		
		//�����û�idɾ���û�
		public boolean delUser(int userid);
		
		//��ѯ�û�������Ϣ
		public User findAll();
		
		//�ж��û��Ƿ����
		public String isExist(String username);

}
