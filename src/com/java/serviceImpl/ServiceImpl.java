package com.java.serviceImpl;

import com.java.dao.UserDao;
import com.java.pojo.User;
import com.java.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User login(User user){
        // TODO Auto-generated method stub
        return userDao.login(user);
    }
    @Override
    public User add(User user){
        // TODO Auto-generated method stub
        return userDao.addUser(user);
    }
}
