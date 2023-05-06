package com.example.nativeexample.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.nativeexample.dao.UserDao;
import com.example.nativeexample.domain.DtsUser;
import com.example.nativeexample.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public DtsUser finDtsUserById(Integer Id) {
        // 数据库查询
        Optional<DtsUser> user = userDao.findById(Long.valueOf(Id));
        if (user.isPresent()) {
            return user.get();
        }
        return null;
    }

    @Override
    public void UpdateUser(DtsUser user) {
        userDao.save(user);
    }

    @Override
    public void DeleteUser(Integer Id) {
        userDao.deleteById(Long.valueOf(Id));
    }

    @Override
    public void InsertUser(DtsUser user) {
        userDao.save(user);
    }
    
}
