package com.wonders.spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("Dao add.............");
    }
}
