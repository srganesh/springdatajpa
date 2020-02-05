package com.gsragavan.spring.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DataJpaApplication {
    public static void main(String... args) {
        ApplicationContext ctx = SpringApplication.run (DataJpaApplication.class,args);
    }
}
