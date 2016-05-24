package com.epam.service.impl;

import com.epam.dao.UserDao;
import com.epam.model.User;
import com.epam.service.UserService;
import org.apache.log4j.Logger;

import java.util.List;

public class UserServiceImpl implements UserService {

    private UserDao userDao;
    private static Logger log = Logger.getLogger(UserServiceImpl.class.getName());

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //impl methods
    public User getUserById(long userId) {
        return userDao.getUserById(userId);
    }

    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    public List<User> getUsersByName(String name, int pageSize, int pageNum) {
        log.debug("get users by name " + name);
        return userDao.getUsersByName(name, pageSize, pageNum);
    }

    public User createUser(User user) {
        return userDao.createUser(user);
    }

    public User updateUser(User user) {
        return userDao.update(user);
    }

    public boolean deleteUser(long userId) {
        return userDao.deleteUser(userId);
    }
}
