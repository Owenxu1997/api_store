package com.zhbit.apistore02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.zhbit.apistore02.dao")
@SpringBootApplication
public class ApiStore02Application {

    public static void main(String[] args) {
        SpringApplication.run(ApiStore02Application.class, args);
    }

}
