package com.karlking.javaspringbootdemo4.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping(path="/helloworld")
    public String helloWorld(){
        return "Hello World...Java Spring!";
    }


    @GetMapping(path="/helloworld-bean")
    public HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World Bean!");
    }

    @GetMapping(path="/helloworld-bean/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

}
