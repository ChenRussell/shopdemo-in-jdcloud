package com.jd.service;



import com.jd.domain.User;

import java.util.List;

public interface UserService {


    // find all users
    public List<User> findUserList();

    // add user
    public User addUser(User user);

    // findById
    public User findById(Integer userid);

    // updateById
    public int updateUserById(String password, Integer userid);

    //delete by id

    public void deleteById(Integer userid);

    //login check
    public boolean checkLogin(User user);
}
