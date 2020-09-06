package com.wonders.config.spring.dao;

import org.springframework.stereotype.Repository;

@Repository(value = "userDao2")
public class UserDaoImpl2  implements UserDao{

    @Override
    public void add() {
        System.out.println("dao2 add ..........");
    }
}
