package com.example.nativeexample.service;

import com.example.nativeexample.domain.DtsUser;

public interface UserService {
    public DtsUser finDtsUserById(Integer Id);
    public void UpdateUser(DtsUser user);
    public void DeleteUser(Integer Id);
    public void InsertUser(DtsUser user);
}
