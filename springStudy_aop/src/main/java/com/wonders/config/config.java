package com.wonders.config;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.wonders.dao"})
@EnableAspectJAutoProxy
public class config {
}
