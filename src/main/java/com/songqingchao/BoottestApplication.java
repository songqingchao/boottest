package com.songqingchao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.songqingchao.mapper")
public class BoottestApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoottestApplication.class, args);
        for (String arg : args) {
            System.out.println("---");
            System.out.println(arg);
        }
        System.out.println(System.getProperties());
    }

}
