package com.jd.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.dao.UserDao;
import com.jd.domain.User;
import com.jd.mapper.UserMapper;
import com.jd.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findUserList(User user) {
//        List<User> users = userDao.findAll();
    	 List<User> users = userMapper.findAllByPage(user);
        return users;
    }

    @Override
    public User addUser(User user) {
        return userDao.save(user);
    }

    @Override
    public User findById(Integer userid) {
        return userDao.findOne(userid);
    }

    public int updateUserById(String password, Integer userid) {
        return userDao.jupdateUser(password, userid);
    }

    @Override
    public void deleteById(Integer userid) {
       userDao.delete(userid);
    }

    @Override
    public boolean checkLogin(User user) {

        List<User> res = userDao.isExist(user.getUsername(), user.getPassword());
        return res.size() != 0;
//        return false;
    }


}
