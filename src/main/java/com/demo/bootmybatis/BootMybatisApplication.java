package com.demo.bootmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan("com.demo.bootmybatis.mapper")//将项目中对应的mapper类的路径加进来就可以了
public class BootMybatisApplication {


	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootMybatisApplication.class, args);

		//查看所用连接池
		//默认 com.zaxxer.hikari.HikariDataSourceiDataSource
		DataSource dataSource = (DataSource) context.getBean("dataSource");
		System.out.println("DATASOURCE = " + dataSource.getClass());
	}
}
