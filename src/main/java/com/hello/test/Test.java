package com.hello.test;

import com.hello.demo.Say;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Say say = (Say) context.getBean("say");
        say.say();

    }
}
