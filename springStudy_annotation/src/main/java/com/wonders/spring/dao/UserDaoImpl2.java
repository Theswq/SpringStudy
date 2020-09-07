package com.wonders.spring.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl2  implements UserDao{

    @Override
    public void add() {
        System.out.println("dao2 add ..........");
    }
}
