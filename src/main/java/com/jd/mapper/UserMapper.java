package com.jd.mapper;

import java.util.List;

import com.jd.domain.User;

public interface UserMapper {
	    //����û�
		public boolean addUser(User user);
		
		//�����û�����
		public boolean updateUser(User user);
		
		//�����û�idɾ���û�
		public boolean delUser(int userid);
		
		//��ѯ�û�������Ϣ
		public List<User> findAllByPage(User user);
		
		//�ж��û��Ƿ����
		public List<User> isExist(User user);

}
