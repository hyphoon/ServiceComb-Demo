package com.service.demo1.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2020-03-09T13:13:05.353Z")

@RestSchema(schemaId = "demo1")
@RequestMapping(path = "/demo1", produces = MediaType.APPLICATION_JSON)
public class Demo1Impl {

    @Autowired
    private Demo1Delegate userDemo1Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userDemo1Delegate.helloworld(name);
    }

}
