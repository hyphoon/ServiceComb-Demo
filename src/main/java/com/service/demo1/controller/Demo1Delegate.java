package com.service.demo1.controller;

import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class Demo1Delegate {

    public String helloworld(String name){

        // Do Some Magic Here!
        return String.format("Wellcome, %s, 现在是北京时间 %tT。", name, new Date());
    }
}
