package com.learning.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @description:测试dubbo-provider
 * @author:San Jinhong
 * @create:2018-08-20 11:05
 **/
public class MyTest {

    @Test
    public void test1() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        context.start();

        //让该程序一直处于运行状态
        System.in.read();
    }
}
