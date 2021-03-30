package com.qiujie.jzb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qiujie.jzb.mapper")
public class JzbApplication {
    public static void main(String[] args) {
        SpringApplication.run(JzbApplication.class, args);
    }

}
