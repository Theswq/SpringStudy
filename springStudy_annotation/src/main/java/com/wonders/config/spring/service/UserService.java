package com.wonders.config.spring.service;

import com.wonders.config.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {


    //定义dao类型属性
    //不需要添加set方法
    //添加Autowired注解,根据类型来注入
   // @Autowired
    //private UserDao userDao;  //当有UserDao有两个实现类时,会
    //报错,因为类型一样,Spring不知道要注入哪一个


//    @Autowired
//    @Qualifier("userDao2")
//    private UserDao userDao;

//   @Resource(name = "userDao2")             //javax扩展包里的，既可以按类型注入，也可以按属性注入
//   private UserDao userDao;

    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    @Value("com.swq")
    private String name;

    public void add(){
        System.out.println("service add......"+name);
        userDao.add();
    }
}
