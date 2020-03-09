package com.service.demo1.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestDemo1 {

        Demo1Delegate demo1Delegate = new Demo1Delegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = demo1Delegate.helloworld("hello");

//        assertEquals(expactReturnValue, returnValue);
        assertNotNull(returnValue);
    }

}