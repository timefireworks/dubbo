package com.learning.test;

import com.learning.service.HelloService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:测试Consumer
 * @author:San Jinhong
 * @create:2018-08-20 14:16
 **/
public class MyTest {

    @Test
    public void test1(){
        ApplicationContext app = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        HelloService helloService = (HelloService) app.getBean("helloService4");
        String info = helloService.sayHello("sss");
        System.out.println(info);

    }

}
