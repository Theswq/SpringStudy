package com.wonders.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.DatabaseMetaData;

@Configuration
@ComponentScan(basePackages = {"com.wonders.dao"})
@EnableTransactionManagement
public class txConfig {

    @Bean
    public DruidDataSource getDruidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://account");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        return druidDataSource;
    }
    @Bean
    public JdbcTemplate getJdbcTemplate(DruidDataSource druidDataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        // 注入datasource,因为已经添加到了ioc容器中了
        jdbcTemplate.setDataSource(druidDataSource);
        return  jdbcTemplate;
    }


    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DataSource dataSource) {

            DataSourceTransactionManager transactionManager = new
                    DataSourceTransactionManager();
            transactionManager.setDataSource(dataSource);
            return transactionManager;
    }




}


