package com.wonders.dao;

import org.springframework.stereotype.Component;

//被增强的类
@Component
public class User {
    public void add(){

        System.out.println("add........");
      //  int a = 1/0; 会出现异常通知
    }
}
