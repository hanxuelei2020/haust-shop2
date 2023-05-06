package com.example.nativeexample.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.nativeexample.domain.DtsUser;

@Repository
public interface UserDao extends CrudRepository<DtsUser, Long>{
    
}
