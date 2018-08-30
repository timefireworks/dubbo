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
        HelloService helloService = (HelloService) app.getBean("helloService");
        HelloService helloService2 = (HelloService) app.getBean("helloService2");
        HelloService helloService3 = (HelloService) app.getBean("helloService3");
        //如果provider里面的服务带了版本号，consumer里面也必须带版本号属性，否则在获取该bean时会报错
        //HelloService helloService4 = (HelloService) app.getBean("helloService4");

        System.out.println(helloService.showVersion());
        System.out.println(helloService2.showVersion());
        System.out.println(helloService3.showVersion());

        HelloService helloService5 = (HelloService) app.getBean("helloService5");
        HelloService helloService6 = (HelloService) app.getBean("helloService6");
        HelloService helloService7 = (HelloService) app.getBean("helloService7");

        System.out.println(helloService5.showVersion());
        System.out.println(helloService6.showVersion());
        System.out.println(helloService7.showVersion());

    }

}
