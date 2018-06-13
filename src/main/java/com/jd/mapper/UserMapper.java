package com.jd.mapper;

import com.jd.domain.User;

public interface UserMapper {
	    //添加用户
		public boolean addUser(User user);
		
		//更新用户密码
		public boolean updateUser(User user);
		
		//根据用户id删除用户
		public boolean delUser(int userid);
		
		//查询用户所有信息
		public User findAll();
		
		//判断用户是否存在
		public String isExist(String username);

}
