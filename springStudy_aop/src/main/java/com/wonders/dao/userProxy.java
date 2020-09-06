package com.wonders.dao;


import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect         //生成代理对象
public class userProxy {

    //配置切点
    @Pointcut(value = "execution(* com.wonders.dao.User.add(..))")
    public void pointdemo(){

    }

    @Before(value = "pointdemo()")
    public void before(){
        System.out.println("before.....");
    }
    @AfterReturning(value = "pointdemo()")
    public void afterReturning(){
        System.out.println("afterReturning 后置通知");

    }
    @After(value = "pointdemo()")
    public void after(){
        System.out.println("after最终通知");
    }
    @AfterThrowing("pointdemo()")
    public void afterThrowing(){
        System.out.println("异常通知+afterThrowing");
    }
    //@Around("pointdemo()")
    public void around(){
        System.out.println("环绕通知之前");
        System.out.println("around环绕通知");
        System.out.println("环绕通知之后");
    }

}
