package com.java.dao;

import com.java.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository("userDao")
@Mapper
public interface UserDao {
    public List<User> selectAllUser();
    public User addUser(User user);
    public User login(User user);
}
