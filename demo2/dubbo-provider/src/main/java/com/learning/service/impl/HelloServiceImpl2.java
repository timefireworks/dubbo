package com.learning.service.impl;

import com.learning.service.HelloService;

public class HelloServiceImpl2 implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }

    @Override
    public String showVersion(){
        return "v2";
    }
}
