package com.example.nativeexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.nativeexample.domain.DtsUser;
import com.example.nativeexample.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user/{userId}")
    public DtsUser UserInfo(@PathVariable("userId") Integer userId) {
        return userService.finDtsUserById(userId);
    }

    @PostMapping("/user")
    public Integer ModifyUserInfo(DtsUser user) {
        if (user == null || user.getId() == null) {
            throw new IllegalArgumentException("参数异常");
        }
        DtsUser userDB = userService.finDtsUserById(user.getId());
        if (userDB == null || userDB.getId() == null) {
            userService.InsertUser(user);
        } else {
            userService.UpdateUser(user);
        }
        return 1;
    }

    @DeleteMapping("/user")
    public Integer DelUserInfo(Integer userId) {
        if (userId == null) {
            throw new IllegalArgumentException("参数异常");
        }
        DtsUser userDB = userService.finDtsUserById(userId);
        if (userDB == null || userDB.getId() == null) {
            throw new IllegalArgumentException("用户不存在");
        } else {
            userService.DeleteUser(userId);
        }
        return 1;
    }
    
}
