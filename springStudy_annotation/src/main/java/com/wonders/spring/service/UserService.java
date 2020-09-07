package com.wonders.spring.service;

import com.wonders.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    //定义dao类型属性
    //不需要添加set方法
    //添加Autowired注解,根据类型来注入
   // @Autowired
    //private UserDao userDao;  //当有UserDao有两个实现类时,会
    //报错,因为类型一样,Spring不知道要注入哪一个


    @Autowired
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    public void add(){
        System.out.println("service add......");
        userDao.add();
    }
}
