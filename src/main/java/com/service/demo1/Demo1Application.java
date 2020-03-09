package com.service.demo1;

import org.apache.servicecomb.springboot.starter.provider.EnableServiceComb;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableServiceComb
public class Demo1Application {
    public static void main(String[] args) {
         SpringApplication.run(Demo1Application.class,args);
    }
}
