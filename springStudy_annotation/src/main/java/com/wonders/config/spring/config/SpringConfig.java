package com.wonders.config.spring.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration   //作为配置文件代替xml配置文件
@ComponentScan(basePackages = {"com.wonders.spring"})
public class SpringConfig {
}
