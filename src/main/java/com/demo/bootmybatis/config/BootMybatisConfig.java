package com.demo.bootmybatis.config;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * 网上有说法：使用c3p0等spring未集成的连接池时，需要此配置类进行手动加入
 * 但经过测试并不需要， 只需在application中配置：
 *    #druid数据源
         spring.datasource.type: com.alibaba.druid.pool.DruidDataSource
      #c3p0数据源
         spring.datasource.type=com.mchange.v2.c3p0.ComboPooledDataSource
       即可
 *
 * */
@Configuration
public class BootMybatisConfig {
 /*   @Bean(name = "dataSource")
    @Qualifier(value = "dataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource(){
        return DataSourceBuilder.create().type(com.mchange.v2.c3p0.ComboPooledDataSource.class).build();
    }*/
}
