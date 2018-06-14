package com.jd.service.serviceImpl;

import com.jd.dao.UserDao;
import com.jd.domain.User;
import com.jd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> findUserList() {
        List<User> users = userDao.findAll();
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
