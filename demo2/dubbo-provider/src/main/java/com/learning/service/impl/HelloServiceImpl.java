package com.learning.service.impl;

import com.learning.service.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    @Override
    public String showVersion(){
        return "v1";
    }
}
